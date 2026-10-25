package uc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public final class x {
    public boolean f49701a;
    public boolean f49702b;
    public boolean f49703c;
    public boolean d;
    public int e;
    public boolean f49704f;
    public byte[] f49705g;

    public static x a(int i10, String str) {
        ?? obj = new Object();
        obj.f49701a = true;
        obj.e = 8;
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
        byte[] bArr = this.f49705g;
        if (bArr != null && bArr.length >= 2) {
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        return 1005;
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.f49705g = bArr;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        StringBuilder u10 = a1.g.u("WebSocketFrame(FIN=");
        String str5 = "0";
        if (!this.f49701a) {
            str = "0";
        } else {
            str = "1";
        }
        u10.append(str);
        u10.append(",RSV1=");
        if (!this.f49702b) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        u10.append(str2);
        u10.append(",RSV2=");
        if (!this.f49703c) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        u10.append(str3);
        u10.append(",RSV3=");
        if (this.d) {
            str5 = "1";
        }
        u10.append(str5);
        u10.append(",Opcode=");
        int i10 = this.e;
        SecureRandom secureRandom = k.f49659a;
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
        u10.append(str4);
        u10.append(",Length=");
        byte[] bArr = this.f49705g;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        u10.append(length);
        int i11 = this.e;
        String str6 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 8) {
                    u10.append(",CloseCode=");
                    u10.append(b());
                    u10.append(",Reason=");
                    byte[] bArr2 = this.f49705g;
                    if (bArr2 != null && bArr2.length >= 3) {
                        try {
                            str6 = new String(bArr2, 2, bArr2.length - 2, "UTF-8");
                        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                        }
                    }
                    if (str6 == null) {
                        u10.append("null");
                    } else {
                        u10.append("\"");
                        u10.append(str6);
                        u10.append("\"");
                    }
                }
            } else {
                u10.append(",Payload=");
                if (this.f49705g == null) {
                    u10.append("null");
                } else if (this.f49702b) {
                    u10.append("compressed");
                } else {
                    int i12 = 0;
                    while (true) {
                        byte[] bArr3 = this.f49705g;
                        if (i12 < bArr3.length) {
                            u10.append(String.format("%02X ", Integer.valueOf(bArr3[i12] & 255)));
                            i12++;
                        } else if (bArr3.length != 0) {
                            u10.setLength(u10.length() - 1);
                        }
                    }
                }
            }
        } else {
            u10.append(",Payload=");
            if (this.f49705g == null) {
                u10.append("null");
            } else if (this.f49702b) {
                u10.append("compressed");
            } else {
                u10.append("\"");
                byte[] bArr4 = this.f49705g;
                if (bArr4 != null) {
                    try {
                        str6 = new String(bArr4, 0, bArr4.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                    }
                }
                u10.append(str6);
                u10.append("\"");
            }
        }
        u10.append(")");
        return u10.toString();
    }
}
