package xf;

import android.graphics.Color;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.i5;
public class b {
    public long[] f50583a;
    public float[] f50584b;
    public String[] f50585c;
    public ArrayList d = new ArrayList();
    public long f50586e = 0;
    public long f50587f = Long.MAX_VALUE;
    public float f50588g = 0.0f;
    public float h = 0.0f;
    public int f50589i;
    public int f50590j;
    public long f50591k;

    public b(JSONObject jSONObject) {
        this.f50589i = 0;
        this.f50590j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f50583a = new long[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    this.f50583a[i11] = jSONArray2.getLong(i12);
                    i11 = i12;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f50578c = jSONArray2.getString(0);
                aVar.f50576a = new long[length2];
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    aVar.f50576a[i13] = jSONArray2.getLong(i14);
                    long j10 = aVar.f50576a[i13];
                    if (j10 > aVar.f50579e) {
                        aVar.f50579e = j10;
                    }
                    if (j10 < aVar.f50580f) {
                        aVar.f50580f = j10;
                    }
                    i13 = i14;
                }
            }
            long[] jArr = this.f50583a;
            if (jArr.length > 1) {
                this.f50591k = jArr[1] - jArr[0];
            } else {
                this.f50591k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f50589i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f50590j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i15 = 0; i15 < this.d.size(); i15++) {
            a aVar2 = (a) this.d.get(i15);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f50578c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f50581g = i5.s("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.f50582i = i0.a.d(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.f50578c);
            }
        }
    }

    public static int d(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("TON")) {
                return 1;
            }
            if (str.contains("XTR")) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public final int a(float f10, int i10) {
        int length = this.f50584b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i11 = length - 1;
        int i12 = i11;
        while (i10 <= i12) {
            int i13 = (i12 + i10) >> 1;
            float[] fArr = this.f50584b;
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
        float[] fArr = this.f50584b;
        int length = fArr.length;
        if (f10 <= fArr[i10]) {
            return i10;
        }
        if (f10 >= fArr[i11]) {
            return i11;
        }
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr2 = this.f50584b;
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
        if (f10 == 0.0f || (length = this.f50584b.length) < 2) {
            return 0;
        }
        int i11 = length - 1;
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr = this.f50584b;
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
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f50583a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j10 = jArr[0];
        long j11 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f50584b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i10 = 0; i10 < length; i10++) {
                this.f50584b[i10] = ((float) (this.f50583a[i10] - j10)) / ((float) (j11 - j10));
            }
        }
        for (int i11 = 0; i11 < this.d.size(); i11++) {
            if (((a) this.d.get(i11)).f50579e > this.f50586e) {
                this.f50586e = ((a) this.d.get(i11)).f50579e;
            }
            if (((a) this.d.get(i11)).f50580f < this.f50587f) {
                this.f50587f = ((a) this.d.get(i11)).f50580f;
            }
            ((a) this.d.get(i11)).f50577b = new SegmentTree(((a) this.d.get(i11)).f50576a);
        }
        long j12 = this.f50591k;
        this.f50585c = new String[((int) ((j11 - j10) / j12)) + 10];
        if (j12 == 1) {
            simpleDateFormat = null;
        } else if (j12 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i12 = 0;
        while (true) {
            String[] strArr = this.f50585c;
            if (i12 < strArr.length) {
                if (this.f50591k == 1) {
                    strArr[i12] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i12));
                } else {
                    strArr[i12] = simpleDateFormat.format(new Date((i12 * this.f50591k) + j10));
                }
                i12++;
            } else {
                long[] jArr2 = this.f50583a;
                this.f50588g = ((float) this.f50591k) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
