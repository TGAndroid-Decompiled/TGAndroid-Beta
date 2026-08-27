package v2;

import android.util.SparseArray;

public final class t {

    public static final SparseArray f48733a;

    public static final t[] f48734b;

    t EF0;

    static {
        t tVar = new t("UNKNOWN_MOBILE_SUBTYPE", 0);
        t tVar2 = new t("GPRS", 1);
        t tVar3 = new t("EDGE", 2);
        t tVar4 = new t("UMTS", 3);
        t tVar5 = new t("CDMA", 4);
        t tVar6 = new t("EVDO_0", 5);
        t tVar7 = new t("EVDO_A", 6);
        t tVar8 = new t("RTT", 7);
        t tVar9 = new t("HSDPA", 8);
        t tVar10 = new t("HSUPA", 9);
        t tVar11 = new t("HSPA", 10);
        t tVar12 = new t("IDEN", 11);
        t tVar13 = new t("EVDO_B", 12);
        t tVar14 = new t("LTE", 13);
        t tVar15 = new t("EHRPD", 14);
        t tVar16 = new t("HSPAP", 15);
        t tVar17 = new t("GSM", 16);
        t tVar18 = new t("TD_SCDMA", 17);
        t tVar19 = new t("IWLAN", 18);
        t tVar20 = new t("LTE_CA", 19);
        f48734b = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15, tVar16, tVar17, tVar18, tVar19, tVar20, new t("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f48733a = sparseArray;
        sparseArray.put(0, tVar);
        sparseArray.put(1, tVar2);
        sparseArray.put(2, tVar3);
        sparseArray.put(3, tVar4);
        sparseArray.put(4, tVar5);
        sparseArray.put(5, tVar6);
        sparseArray.put(6, tVar7);
        sparseArray.put(7, tVar8);
        sparseArray.put(8, tVar9);
        sparseArray.put(9, tVar10);
        sparseArray.put(10, tVar11);
        sparseArray.put(11, tVar12);
        sparseArray.put(12, tVar13);
        sparseArray.put(13, tVar14);
        sparseArray.put(14, tVar15);
        sparseArray.put(15, tVar16);
        sparseArray.put(16, tVar17);
        sparseArray.put(17, tVar18);
        sparseArray.put(18, tVar19);
        sparseArray.put(19, tVar20);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f48734b.clone();
    }
}
