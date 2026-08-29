package uf;

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
    public long[] f49197a;
    public float[] f49198b;
    public String[] f49199c;
    public ArrayList d = new ArrayList();
    public long f49200e = 0;
    public long f49201f = Long.MAX_VALUE;
    public float f49202g = 0.0f;
    public float h = 0.0f;
    public int f49203i;
    public int f49204j;
    public long f49205k;

    public b(JSONObject jSONObject) {
        this.f49203i = 0;
        this.f49204j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f49197a = new long[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    this.f49197a[i11] = jSONArray2.getLong(i12);
                    i11 = i12;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f49192c = jSONArray2.getString(0);
                aVar.f49190a = new long[length2];
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    aVar.f49190a[i13] = jSONArray2.getLong(i14);
                    long j10 = aVar.f49190a[i13];
                    if (j10 > aVar.f49193e) {
                        aVar.f49193e = j10;
                    }
                    if (j10 < aVar.f49194f) {
                        aVar.f49194f = j10;
                    }
                    i13 = i14;
                }
            }
            long[] jArr = this.f49197a;
            if (jArr.length > 1) {
                this.f49205k = jArr[1] - jArr[0];
            } else {
                this.f49205k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f49203i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f49204j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i15 = 0; i15 < this.d.size(); i15++) {
            a aVar2 = (a) this.d.get(i15);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f49192c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f49195g = e5.s("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.f49196i = i0.a.d(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.f49192c);
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

    public final int a(float f9, int i10) {
        int length = this.f49198b.length;
        if (f9 == 1.0f) {
            return length - 1;
        }
        int i11 = length - 1;
        int i12 = i11;
        while (i10 <= i12) {
            int i13 = (i12 + i10) >> 1;
            float[] fArr = this.f49198b;
            float f10 = fArr[i13];
            if ((f9 > f10 && (i13 == i11 || f9 < fArr[i13 + 1])) || f9 == f10) {
                return i13;
            }
            if (f9 < f10) {
                i12 = i13 - 1;
            } else if (f9 > f10) {
                i10 = i13 + 1;
            }
        }
        return i12;
    }

    public final int b(float f9, int i10, int i11) {
        float[] fArr = this.f49198b;
        int length = fArr.length;
        if (f9 <= fArr[i10]) {
            return i10;
        }
        if (f9 >= fArr[i11]) {
            return i11;
        }
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr2 = this.f49198b;
            float f10 = fArr2[i12];
            if ((f9 > f10 && (i12 == length - 1 || f9 < fArr2[i12 + 1])) || f9 == f10) {
                return i12;
            }
            if (f9 < f10) {
                i11 = i12 - 1;
            } else if (f9 > f10) {
                i10 = i12 + 1;
            }
        }
        return i11;
    }

    public final int c(float f9) {
        int length;
        int i10 = 0;
        if (f9 == 0.0f || (length = this.f49198b.length) < 2) {
            return 0;
        }
        int i11 = length - 1;
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr = this.f49198b;
            float f10 = fArr[i12];
            if ((f9 < f10 && (i12 == 0 || f9 > fArr[i12 - 1])) || f9 == f10) {
                return i12;
            }
            if (f9 < f10) {
                i11 = i12 - 1;
            } else if (f9 > f10) {
                i10 = i12 + 1;
            }
        }
        return i10;
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f49197a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j10 = jArr[0];
        long j11 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f49198b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i10 = 0; i10 < length; i10++) {
                this.f49198b[i10] = ((float) (this.f49197a[i10] - j10)) / ((float) (j11 - j10));
            }
        }
        for (int i11 = 0; i11 < this.d.size(); i11++) {
            if (((a) this.d.get(i11)).f49193e > this.f49200e) {
                this.f49200e = ((a) this.d.get(i11)).f49193e;
            }
            if (((a) this.d.get(i11)).f49194f < this.f49201f) {
                this.f49201f = ((a) this.d.get(i11)).f49194f;
            }
            ((a) this.d.get(i11)).f49191b = new SegmentTree(((a) this.d.get(i11)).f49190a);
        }
        long j12 = this.f49205k;
        this.f49199c = new String[((int) ((j11 - j10) / j12)) + 10];
        if (j12 == 1) {
            simpleDateFormat = null;
        } else if (j12 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i12 = 0;
        while (true) {
            String[] strArr = this.f49199c;
            if (i12 < strArr.length) {
                if (this.f49205k == 1) {
                    strArr[i12] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i12));
                } else {
                    strArr[i12] = simpleDateFormat.format(new Date((i12 * this.f49205k) + j10));
                }
                i12++;
            } else {
                long[] jArr2 = this.f49197a;
                this.f49202g = ((float) this.f49205k) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
