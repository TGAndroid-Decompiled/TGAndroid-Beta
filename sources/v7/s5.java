package v7;
public abstract class s5 {
    public static String a(com.google.android.gms.internal.cast.z4 z4Var) {
        StringBuilder sb2 = new StringBuilder(z4Var.o());
        for (int i10 = 0; i10 < z4Var.o(); i10++) {
            byte i11 = z4Var.i(i10);
            if (i11 != 34) {
                if (i11 != 39) {
                    if (i11 != 92) {
                        switch (i11) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (i11 >= 32 && i11 <= 126) {
                                    sb2.append((char) i11);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((i11 >>> 6) & 3) + 48));
                                    sb2.append((char) (((i11 >>> 3) & 7) + 48));
                                    sb2.append((char) ((i11 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
