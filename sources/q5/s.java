package q5;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f42889a;
    public int f42890b;
    public int f42891c;
    public int d;
    public int e;
    public int f42892f;
    public int h;
    public int f42893n;
    public String f42894r;
    public int f42895s;
    public int v;
    public String f42896w;
    public JSONObject f42897x;

    public s(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f42889a = f10;
        this.f42890b = i10;
        this.f42891c = i11;
        this.d = i12;
        this.e = i13;
        this.f42892f = i14;
        this.h = i15;
        this.f42893n = i16;
        this.f42894r = str;
        this.f42895s = i17;
        this.v = i18;
        this.f42896w = str2;
        if (str2 != null) {
            try {
                this.f42897x = new JSONObject(this.f42896w);
                return;
            } catch (JSONException unused) {
                this.f42897x = null;
                this.f42896w = null;
                return;
            }
        }
        this.f42897x = null;
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
            jSONObject.put("fontScale", this.f42889a);
            int i10 = this.f42890b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", g(i10));
            }
            int i11 = this.f42891c;
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
            int i13 = this.e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", g(i13));
            }
            int i14 = this.f42892f;
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
            if (this.f42892f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f42893n);
            }
            String str = this.f42894r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f42895s) {
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
            JSONObject jSONObject2 = this.f42897x;
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
        JSONObject jSONObject = this.f42897x;
        if (jSONObject != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        JSONObject jSONObject2 = sVar.f42897x;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z4 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || i6.c.a(jSONObject, jSONObject2)) && this.f42889a == sVar.f42889a && this.f42890b == sVar.f42890b && this.f42891c == sVar.f42891c && this.d == sVar.d && this.e == sVar.e && this.f42892f == sVar.f42892f && this.h == sVar.h && this.f42893n == sVar.f42893n && u5.a.d(this.f42894r, sVar.f42894r) && this.f42895s == sVar.f42895s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f42889a), Integer.valueOf(this.f42890b), Integer.valueOf(this.f42891c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f42892f), Integer.valueOf(this.h), Integer.valueOf(this.f42893n), this.f42894r, Integer.valueOf(this.f42895s), Integer.valueOf(this.v), String.valueOf(this.f42897x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f42897x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f42896w = jSONObject;
        int q10 = f5.q(parcel, 20293);
        float f10 = this.f42889a;
        f5.s(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i11 = this.f42890b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f42891c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f42892f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f42893n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(i17);
        f5.l(parcel, 10, this.f42894r);
        int i18 = this.f42895s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeInt(i19);
        f5.l(parcel, 13, this.f42896w);
        f5.r(parcel, q10);
    }
}
