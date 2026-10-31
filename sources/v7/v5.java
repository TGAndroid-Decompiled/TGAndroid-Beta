package v7;
public abstract class v5 {
    public static String a(com.google.android.gms.internal.cast.v4 v4Var) {
        StringBuilder sb2 = new StringBuilder(v4Var.n());
        for (int i10 = 0; i10 < v4Var.n(); i10++) {
            byte l4 = v4Var.l(i10);
            if (l4 != 34) {
                if (l4 != 39) {
                    if (l4 != 92) {
                        switch (l4) {
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
                                if (l4 >= 32 && l4 <= 126) {
                                    sb2.append((char) l4);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((l4 >>> 6) & 3) + 48));
                                    sb2.append((char) (((l4 >>> 3) & 7) + 48));
                                    sb2.append((char) ((l4 & 7) + 48));
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
