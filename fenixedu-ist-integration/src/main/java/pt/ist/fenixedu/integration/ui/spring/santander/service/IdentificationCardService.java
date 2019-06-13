package pt.ist.fenixedu.integration.ui.spring.santander.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.fenixedu.academic.domain.ExecutionYear;
import org.fenixedu.academic.domain.Person;
import org.fenixedu.bennu.core.domain.Bennu;
import org.fenixedu.idcards.service.SantanderRequestCardService;
import org.springframework.stereotype.Service;

import pt.ist.fenixedu.integration.domain.santander.RequestCardUtils;

@Service
public class IdentificationCardService {

    public void createRegister(Person person, ExecutionYear executionYear, String action) {
        String tuiEntry = RequestCardUtils.generateLine(person, executionYear, action);
        SantanderRequestCardService.createRegister(tuiEntry, person);
    }

    public List<ExecutionYear> getExecutionYears() {
        return Bennu.getInstance().getSantanderEntriesNewSet().stream().map(sen -> sen.getExecutionYear()).distinct()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
