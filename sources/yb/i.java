package yb;
public final class i {
    public static final i f59367a;
    public static final i f59368b;
    public static final i f59369c;
    public static final i d;
    public static final i f59370e;
    public static final i f59371f;
    public static final i[] h;
    i EF0;

    static {
        Enum r02 = new Enum("OTHER", 0);
        Enum r12 = new Enum("ORIENTATION", 1);
        ?? r32 = new Enum("BYTE_SEGMENTS", 2);
        f59367a = r32;
        ?? r5 = new Enum("ERROR_CORRECTION_LEVEL", 3);
        f59368b = r5;
        ?? r72 = new Enum("ERRORS_CORRECTED", 4);
        f59369c = r72;
        Enum r9 = new Enum("ERASURES_CORRECTED", 5);
        Enum r11 = new Enum("ISSUE_NUMBER", 6);
        Enum r13 = new Enum("SUGGESTED_PRICE", 7);
        Enum r15 = new Enum("POSSIBLE_COUNTRY", 8);
        Enum r22 = new Enum("UPC_EAN_EXTENSION", 9);
        Enum r42 = new Enum("PDF417_EXTRA_METADATA", 10);
        ?? r62 = new Enum("STRUCTURED_APPEND_SEQUENCE", 11);
        d = r62;
        ?? r82 = new Enum("STRUCTURED_APPEND_PARITY", 12);
        f59370e = r82;
        ?? r10 = new Enum("SYMBOLOGY_IDENTIFIER", 13);
        f59371f = r10;
        h = new i[]{r02, r12, r32, r5, r72, r9, r11, r13, r15, r22, r42, r62, r82, r10};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) h.clone();
    }
}
