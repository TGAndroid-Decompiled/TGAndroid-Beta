package rf;

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
import org.telegram.ui.ActionBar.e5;
public class b {
    public long[] f47160a;
    public float[] f47161b;
    public String[] f47162c;
    public ArrayList d = new ArrayList();
    public long f47163e = 0;
    public long f47164f = Long.MAX_VALUE;
    public float f47165g = 0.0f;
    public float h = 0.0f;
    public int f47166i;
    public int f47167j;
    public long f47168k;

    public b(JSONObject jSONObject) {
        this.f47166i = 0;
        this.f47167j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i9);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f47160a = new long[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    this.f47160a[i10] = jSONArray2.getLong(i11);
                    i10 = i11;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f47155c = jSONArray2.getString(0);
                aVar.f47153a = new long[length2];
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12 + 1;
                    aVar.f47153a[i12] = jSONArray2.getLong(i13);
                    long j10 = aVar.f47153a[i12];
                    if (j10 > aVar.f47156e) {
                        aVar.f47156e = j10;
                    }
                    if (j10 < aVar.f47157f) {
                        aVar.f47157f = j10;
                    }
                    i12 = i13;
                }
            }
            long[] jArr = this.f47160a;
            if (jArr.length > 1) {
                this.f47168k = jArr[1] - jArr[0];
            } else {
                this.f47168k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f47166i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f47167j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i14 = 0; i14 < this.d.size(); i14++) {
            a aVar2 = (a) this.d.get(i14);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f47155c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f47158g = e5.s("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.f47159i = i0.a.d(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.f47155c);
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

    public final int a(float f10, int i9) {
        int length = this.f47161b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i10 = length - 1;
        int i11 = i10;
        while (i9 <= i11) {
            int i12 = (i11 + i9) >> 1;
            float[] fArr = this.f47161b;
            float f11 = fArr[i12];
            if ((f10 > f11 && (i12 == i10 || f10 < fArr[i12 + 1])) || f10 == f11) {
                return i12;
            }
            if (f10 < f11) {
                i11 = i12 - 1;
            } else if (f10 > f11) {
                i9 = i12 + 1;
            }
        }
        return i11;
    }

    public final int b(float f10, int i9, int i10) {
        float[] fArr = this.f47161b;
        int length = fArr.length;
        if (f10 <= fArr[i9]) {
            return i9;
        }
        if (f10 >= fArr[i10]) {
            return i10;
        }
        while (i9 <= i10) {
            int i11 = (i10 + i9) >> 1;
            float[] fArr2 = this.f47161b;
            float f11 = fArr2[i11];
            if ((f10 > f11 && (i11 == length - 1 || f10 < fArr2[i11 + 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i9 = i11 + 1;
            }
        }
        return i10;
    }

    public final int c(float f10) {
        int length;
        int i9 = 0;
        if (f10 == 0.0f || (length = this.f47161b.length) < 2) {
            return 0;
        }
        int i10 = length - 1;
        while (i9 <= i10) {
            int i11 = (i10 + i9) >> 1;
            float[] fArr = this.f47161b;
            float f11 = fArr[i11];
            if ((f10 < f11 && (i11 == 0 || f10 > fArr[i11 - 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i9 = i11 + 1;
            }
        }
        return i9;
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f47160a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j10 = jArr[0];
        long j11 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f47161b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i9 = 0; i9 < length; i9++) {
                this.f47161b[i9] = ((float) (this.f47160a[i9] - j10)) / ((float) (j11 - j10));
            }
        }
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            if (((a) this.d.get(i10)).f47156e > this.f47163e) {
                this.f47163e = ((a) this.d.get(i10)).f47156e;
            }
            if (((a) this.d.get(i10)).f47157f < this.f47164f) {
                this.f47164f = ((a) this.d.get(i10)).f47157f;
            }
            ((a) this.d.get(i10)).f47154b = new SegmentTree(((a) this.d.get(i10)).f47153a);
        }
        long j12 = this.f47168k;
        this.f47162c = new String[((int) ((j11 - j10) / j12)) + 10];
        if (j12 == 1) {
            simpleDateFormat = null;
        } else if (j12 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i11 = 0;
        while (true) {
            String[] strArr = this.f47162c;
            if (i11 < strArr.length) {
                if (this.f47168k == 1) {
                    strArr[i11] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i11));
                } else {
                    strArr[i11] = simpleDateFormat.format(new Date((i11 * this.f47168k) + j10));
                }
                i11++;
            } else {
                long[] jArr2 = this.f47160a;
                this.f47165g = ((float) this.f47168k) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
