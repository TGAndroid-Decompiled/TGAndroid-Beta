package rc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
public final class x {
    public boolean f54507a;
    public boolean f54508b;
    public boolean f54509c;
    public boolean d;
    public int f54510e;
    public boolean f54511f;
    public byte[] f54512g;

    public static x a(int i7, String str) {
        ?? obj = new Object();
        obj.f54507a = true;
        obj.f54510e = 8;
        byte[] bArr = {(byte) ((i7 >> 8) & 255), (byte) (i7 & 255)};
        if (str != null && str.length() != 0) {
            byte[] a10 = k.a(str);
            byte[] bArr2 = new byte[a10.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            System.arraycopy(a10, 0, bArr2, 2, a10.length);
            obj.c(bArr2);
            return obj;
        }
        obj.c(bArr);
        return obj;
    }

    public final int b() {
        byte[] bArr = this.f54512g;
        if (bArr != null && bArr.length >= 2) {
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        return 1005;
    }

    public final void c(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.f54512g = bArr;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("WebSocketFrame(FIN=");
        String str5 = "0";
        if (!this.f54507a) {
            str = "0";
        } else {
            str = "1";
        }
        m10.append(str);
        m10.append(",RSV1=");
        if (!this.f54508b) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        m10.append(str2);
        m10.append(",RSV2=");
        if (!this.f54509c) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        m10.append(str3);
        m10.append(",RSV3=");
        if (this.d) {
            str5 = "1";
        }
        m10.append(str5);
        m10.append(",Opcode=");
        int i7 = this.f54510e;
        SecureRandom secureRandom = k.f54460a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    switch (i7) {
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
                            if (1 <= i7 && i7 <= 7) {
                                str4 = String.format("DATA(0x%X)", Integer.valueOf(i7));
                                break;
                            } else if (8 <= i7 && i7 <= 15) {
                                str4 = String.format("CONTROL(0x%X)", Integer.valueOf(i7));
                                break;
                            } else {
                                str4 = String.format("0x%X", Integer.valueOf(i7));
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
        m10.append(str4);
        m10.append(",Length=");
        byte[] bArr = this.f54512g;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        m10.append(length);
        int i10 = this.f54510e;
        String str6 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    m10.append(",CloseCode=");
                    m10.append(b());
                    m10.append(",Reason=");
                    byte[] bArr2 = this.f54512g;
                    if (bArr2 != null && bArr2.length >= 3) {
                        try {
                            str6 = new String(bArr2, 2, bArr2.length - 2, "UTF-8");
                        } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                        }
                    }
                    if (str6 == null) {
                        m10.append("null");
                    } else {
                        m10.append("\"");
                        m10.append(str6);
                        m10.append("\"");
                    }
                }
            } else {
                m10.append(",Payload=");
                if (this.f54512g == null) {
                    m10.append("null");
                } else if (this.f54508b) {
                    m10.append("compressed");
                } else {
                    int i11 = 0;
                    while (true) {
                        byte[] bArr3 = this.f54512g;
                        if (i11 < bArr3.length) {
                            m10.append(String.format("%02X ", Integer.valueOf(bArr3[i11] & 255)));
                            i11++;
                        } else if (bArr3.length != 0) {
                            m10.setLength(m10.length() - 1);
                        }
                    }
                }
            }
        } else {
            m10.append(",Payload=");
            if (this.f54512g == null) {
                m10.append("null");
            } else if (this.f54508b) {
                m10.append("compressed");
            } else {
                m10.append("\"");
                byte[] bArr4 = this.f54512g;
                if (bArr4 != null) {
                    try {
                        str6 = new String(bArr4, 0, bArr4.length, "UTF-8");
                    } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused2) {
                    }
                }
                m10.append(str6);
                m10.append("\"");
            }
        }
        m10.append(")");
        return m10.toString();
    }
}
