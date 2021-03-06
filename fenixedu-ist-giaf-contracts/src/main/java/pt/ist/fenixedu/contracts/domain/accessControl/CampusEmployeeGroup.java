package pt.ist.fenixedu.contracts.domain.accessControl;

import org.fenixedu.bennu.core.annotation.GroupOperator;
import org.fenixedu.bennu.core.domain.groups.PersistentGroup;
import org.fenixedu.bennu.core.groups.Group;
import org.fenixedu.spaces.domain.Space;

/**
 * Created by Sérgio Silva (hello@fenixedu.org).
 */

@GroupOperator("campusEmployee")
public class CampusEmployeeGroup extends CampusSapGroup {

    private static final String[] SAP_GROUPS = new String[] { " Não Docente", " Dirigentes", " Técnicos e Administ." };

    public CampusEmployeeGroup() {
        super();
    }
    
    private CampusEmployeeGroup(Space campus) {
        super(campus);
    }

    public static Group get(final Space campus) {
        return new CampusEmployeeGroup(campus);
    }

    @Override
    public String[] getSapGroups() {
        return SAP_GROUPS;
    }

    @Override
    public PersistentGroup toPersistentGroup() {
        return PersistentCampusEmployeeGroup.getInstance(campus);
    }
}