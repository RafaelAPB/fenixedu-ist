/**
 * Copyright © 2013 Instituto Superior Técnico
 *
 * This file is part of FenixEdu IST QUC.
 *
 * FenixEdu IST QUC is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu IST QUC is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu IST QUC.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.ist.fenixedu.quc.dto;

import org.fenixedu.academic.domain.DegreeCurricularPlan;

import pt.ist.fenixframework.FenixFramework;

public class ViewInquiriesResultPageDTO extends SearchInquiriesResultPageDTO {

    private String degreeCurricularPlanID;

    public String getDegreeCurricularPlanID() {
        return degreeCurricularPlanID;
    }

    public void setDegreeCurricularPlanID(String degreeCurricularPlanID) {
        this.degreeCurricularPlanID = degreeCurricularPlanID;
    }

    public DegreeCurricularPlan getDegreeCurricularPlan() {
        final String degreeCurricularPlanID = getDegreeCurricularPlanID();
        return FenixFramework.getDomainObject(degreeCurricularPlanID);
    }

}
