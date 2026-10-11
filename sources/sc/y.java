package sc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public final class y {
    public boolean f48051a;
    public boolean f48052b;
    public boolean f48053c;
    public boolean d;
    public int f48054e;
    public boolean f48055f;
    public byte[] f48056g;

    public static y a(int i10, String str) {
        ?? obj = new Object();
        obj.f48051a = true;
        obj.f48054e = 8;
        byte[] bArr = {(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
        if (str != null && str.length() != 0) {
            byte[] a2 = k.a(str);
            byte[] bArr2 = new byte[a2.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            System.arraycopy(a2, 0, bArr2, 2, a2.length);
            obj.c(bArr2);
            return obj;
        }
        obj.c(bArr);
        return obj;
    }

    public final int b() {
        byte[] bArr = this.f48056g;
        if (bArr != null && bArr.length >= 2) {
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        return 1005;
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.f48056g = bArr;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        StringBuilder v = a1.g.v("WebSocketFrame(FIN=");
        String str5 = "0";
        if (!this.f48051a) {
            str = "0";
        } else {
            str = "1";
        }
        v.append(str);
        v.append(",RSV1=");
        if (!this.f48052b) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        v.append(str2);
        v.append(",RSV2=");
        if (!this.f48053c) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        v.append(str3);
        v.append(",RSV3=");
        if (this.d) {
            str5 = "1";
        }
        v.append(str5);
        v.append(",Opcode=");
        int i10 = this.f48054e;
        SecureRandom secureRandom = k.f48004a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    switch (i10) {
                        case 8:
                            str4 = "CLOSE";
                            break;
                        case 9:
                            str4 = "PING";
                            break;
                        case 10:
                            str4 = "PONG";
                            break;
                        default:
                            if (1 <= i10 && i10 <= 7) {
                                str4 = String.format("DATA(0x%X)", Integer.valueOf(i10));
                                break;
                            } else if (8 <= i10 && i10 <= 15) {
                                str4 = String.format("CONTROL(0x%X)", Integer.valueOf(i10));
                                break;
                            } else {
                                str4 = String.format("0x%X", Integer.valueOf(i10));
                                break;
                            }
                            break;
                    }
                } else {
                    str4 = "BINARY";
                }
            } else {
                str4 = "TEXT";
            }
        } else {
            str4 = "CONTINUATION";
        }
        v.append(str4);
        v.append(",Length=");
        byte[] bArr = this.f48056g;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        v.append(length);
        int i11 = this.f48054e;
        String str6 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 8) {
                    v.append(",CloseCode=");
                    v.append(b());
                    v.append(",Reason=");
                    byte[] bArr2 = this.f48056g;
                    if (bArr2 != null && bArr2.length >= 3) {
                        try {
                            str6 = new String(bArr2, 2, bArr2.length - 2, "UTF-8");
                        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                        }
                    }
                    if (str6 == null) {
                        v.append("null");
                    } else {
                        v.append("\"");
                        v.append(str6);
                        v.append("\"");
                    }
                }
            } else {
                v.append(",Payload=");
                if (this.f48056g == null) {
                    v.append("null");
                } else if (this.f48052b) {
                    v.append("compressed");
                } else {
                    int i12 = 0;
                    while (true) {
                        byte[] bArr3 = this.f48056g;
                        if (i12 < bArr3.length) {
                            v.append(String.format("%02X ", Integer.valueOf(bArr3[i12] & 255)));
                            i12++;
                        } else if (bArr3.length != 0) {
                            v.setLength(v.length() - 1);
                        }
                    }
                }
            }
        } else {
            v.append(",Payload=");
            if (this.f48056g == null) {
                v.append("null");
            } else if (this.f48052b) {
                v.append("compressed");
            } else {
                v.append("\"");
                byte[] bArr4 = this.f48056g;
                if (bArr4 != null) {
                    try {
                        str6 = new String(bArr4, 0, bArr4.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                    }
                }
                v.append(str6);
                v.append("\"");
            }
        }
        v.append(")");
        return v.toString();
    }
}
