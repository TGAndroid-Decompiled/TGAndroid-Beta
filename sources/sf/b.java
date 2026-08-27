package sf;

import android.graphics.Color;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.e5;

public class b {

    public long[] f47881a;

    public float[] f47882b;

    public String[] f47883c;
    public ArrayList d = new ArrayList();

    public long f47884e = 0;

    public long f47885f = Long.MAX_VALUE;

    public float f47886g = 0.0f;
    public float h = 0.0f;

    public int f47887i;

    public int f47888j;

    public long f47889k;

    public b(JSONObject jSONObject) throws JSONException {
        this.f47887i = 0;
        this.f47888j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f47881a = new long[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    this.f47881a[i11] = jSONArray2.getLong(i12);
                    i11 = i12;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f47876c = jSONArray2.getString(0);
                aVar.f47874a = new long[length2];
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    aVar.f47874a[i13] = jSONArray2.getLong(i14);
                    long j10 = aVar.f47874a[i13];
                    if (j10 > aVar.f47877e) {
                        aVar.f47877e = j10;
                    }
                    if (j10 < aVar.f47878f) {
                        aVar.f47878f = j10;
                    }
                    i13 = i14;
                }
            }
            long[] jArr = this.f47881a;
            if (jArr.length > 1) {
                this.f47889k = jArr[1] - jArr[0];
            } else {
                this.f47889k = 86400000L;
            }
            e();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("colors");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f47887i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f47888j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern patternCompile = Pattern.compile("(.*)(#.*)");
        for (int i15 = 0; i15 < this.d.size(); i15++) {
            a aVar2 = (a) this.d.get(i15);
            if (jSONObjectOptJSONObject != null) {
                Matcher matcher = patternCompile.matcher(jSONObjectOptJSONObject.getString(aVar2.f47876c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f47879g = e5.s("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int color = Color.parseColor(matcher.group(2));
                    aVar2.h = color;
                    aVar2.f47880i = i0.b.d(0.85f, -1, color);
                }
            }
            if (jSONObjectOptJSONObject2 != null) {
                aVar2.d = jSONObjectOptJSONObject2.getString(aVar2.f47876c);
            }
        }
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains("TON")) {
            return 1;
        }
        return str.contains("XTR") ? 2 : 0;
    }

    public final int a(float f10, int i10) {
        int length = this.f47882b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i11 = length - 1;
        int i12 = i11;
        while (i10 <= i12) {
            int i13 = (i12 + i10) >> 1;
            float[] fArr = this.f47882b;
            float f11 = fArr[i13];
            if ((f10 > f11 && (i13 == i11 || f10 < fArr[i13 + 1])) || f10 == f11) {
                return i13;
            }
            if (f10 < f11) {
                i12 = i13 - 1;
            } else if (f10 > f11) {
                i10 = i13 + 1;
            }
        }
        return i12;
    }

    public final int b(float f10, int i10, int i11) {
        float[] fArr = this.f47882b;
        int length = fArr.length;
        if (f10 <= fArr[i10]) {
            return i10;
        }
        if (f10 >= fArr[i11]) {
            return i11;
        }
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr2 = this.f47882b;
            float f11 = fArr2[i12];
            if ((f10 > f11 && (i12 == length - 1 || f10 < fArr2[i12 + 1])) || f10 == f11) {
                return i12;
            }
            if (f10 < f11) {
                i11 = i12 - 1;
            } else if (f10 > f11) {
                i10 = i12 + 1;
            }
        }
        return i11;
    }

    public final int c(float f10) {
        int length;
        int i10 = 0;
        if (f10 == 0.0f || (length = this.f47882b.length) < 2) {
            return 0;
        }
        int i11 = length - 1;
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr = this.f47882b;
            float f11 = fArr[i12];
            if ((f10 < f11 && (i12 == 0 || f10 > fArr[i12 - 1])) || f10 == f11) {
                return i12;
            }
            if (f10 < f11) {
                i11 = i12 - 1;
            } else if (f10 > f11) {
                i10 = i12 + 1;
            }
        }
        return i10;
    }

    public void e() {
        long[] jArr = this.f47881a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j10 = jArr[0];
        long j11 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f47882b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i10 = 0; i10 < length; i10++) {
                this.f47882b[i10] = (this.f47881a[i10] - j10) / (j11 - j10);
            }
        }
        for (int i11 = 0; i11 < this.d.size(); i11++) {
            if (((a) this.d.get(i11)).f47877e > this.f47884e) {
                this.f47884e = ((a) this.d.get(i11)).f47877e;
            }
            if (((a) this.d.get(i11)).f47878f < this.f47885f) {
                this.f47885f = ((a) this.d.get(i11)).f47878f;
            }
            ((a) this.d.get(i11)).f47875b = new SegmentTree(((a) this.d.get(i11)).f47874a);
        }
        long j12 = this.f47889k;
        this.f47883c = new String[((int) ((j11 - j10) / j12)) + 10];
        SimpleDateFormat simpleDateFormat = j12 == 1 ? null : j12 < 86400000 ? new SimpleDateFormat("HH:mm") : new SimpleDateFormat("MMM d");
        int i12 = 0;
        while (true) {
            String[] strArr = this.f47883c;
            if (i12 >= strArr.length) {
                float f10 = this.f47889k;
                long[] jArr2 = this.f47881a;
                this.f47886g = f10 / (jArr2[jArr2.length - 1] - jArr2[0]);
                return;
            } else {
                if (this.f47889k == 1) {
                    strArr[i12] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i12));
                } else {
                    strArr[i12] = simpleDateFormat.format(new Date((((long) i12) * this.f47889k) + j10));
                }
                i12++;
            }
        }
    }
}
