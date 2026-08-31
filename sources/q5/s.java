package q5;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f44617a;
    public int f44618b;
    public int f44619c;
    public int d;
    public int f44620e;
    public int f44621f;
    public int h;
    public int f44622n;
    public String f44623r;
    public int f44624s;
    public int v;
    public String f44625w;
    public JSONObject f44626x;

    public s(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f44617a = f10;
        this.f44618b = i10;
        this.f44619c = i11;
        this.d = i12;
        this.f44620e = i13;
        this.f44621f = i14;
        this.h = i15;
        this.f44622n = i16;
        this.f44623r = str;
        this.f44624s = i17;
        this.v = i18;
        this.f44625w = str2;
        if (str2 != null) {
            try {
                this.f44626x = new JSONObject(this.f44625w);
                return;
            } catch (JSONException unused) {
                this.f44626x = null;
                this.f44625w = null;
                return;
            }
        }
        this.f44626x = null;
    }

    public static final int f(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String g(int i10) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Integer.valueOf(Color.alpha(i10)));
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f44617a);
            int i10 = this.f44618b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", g(i10));
            }
            int i11 = this.f44619c;
            if (i11 != 0) {
                jSONObject.put("backgroundColor", g(i11));
            }
            int i12 = this.d;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                jSONObject.put("edgeType", "DEPRESSED");
                            }
                        } else {
                            jSONObject.put("edgeType", "RAISED");
                        }
                    } else {
                        jSONObject.put("edgeType", "DROP_SHADOW");
                    }
                } else {
                    jSONObject.put("edgeType", "OUTLINE");
                }
            } else {
                jSONObject.put("edgeType", "NONE");
            }
            int i13 = this.f44620e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", g(i13));
            }
            int i14 = this.f44621f;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i15 = this.h;
            if (i15 != 0) {
                jSONObject.put("windowColor", g(i15));
            }
            if (this.f44621f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f44622n);
            }
            String str = this.f44623r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f44624s) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i16 = this.v;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            jSONObject.put("fontStyle", "BOLD_ITALIC");
                        }
                    } else {
                        jSONObject.put("fontStyle", "ITALIC");
                    }
                } else {
                    jSONObject.put("fontStyle", "BOLD");
                }
            } else {
                jSONObject.put("fontStyle", "NORMAL");
            }
            JSONObject jSONObject2 = this.f44626x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        JSONObject jSONObject = this.f44626x;
        if (jSONObject != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        JSONObject jSONObject2 = sVar.f44626x;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z4 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || i6.c.a(jSONObject, jSONObject2)) && this.f44617a == sVar.f44617a && this.f44618b == sVar.f44618b && this.f44619c == sVar.f44619c && this.d == sVar.d && this.f44620e == sVar.f44620e && this.f44621f == sVar.f44621f && this.h == sVar.h && this.f44622n == sVar.f44622n && u5.a.d(this.f44623r, sVar.f44623r) && this.f44624s == sVar.f44624s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44617a), Integer.valueOf(this.f44618b), Integer.valueOf(this.f44619c), Integer.valueOf(this.d), Integer.valueOf(this.f44620e), Integer.valueOf(this.f44621f), Integer.valueOf(this.h), Integer.valueOf(this.f44622n), this.f44623r, Integer.valueOf(this.f44624s), Integer.valueOf(this.v), String.valueOf(this.f44626x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f44626x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f44625w = jSONObject;
        int q10 = g5.q(parcel, 20293);
        float f10 = this.f44617a;
        g5.s(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i11 = this.f44618b;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f44619c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f44620e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f44621f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f44622n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(i17);
        g5.l(parcel, 10, this.f44623r);
        int i18 = this.f44624s;
        g5.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeInt(i19);
        g5.l(parcel, 13, this.f44625w);
        g5.r(parcel, q10);
    }
}
