package qg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class s0 {
    public static final List f44588m;
    public static final List f44589n;
    public static final int f44590o;
    public static final int f44591p;
    public static final int f44592q;
    public static final s0[] f44593r;
    public final SharedPreferences f44594a;
    public final ArrayList f44595b;
    public final HashMap f44596c;
    public List d;
    public boolean f44597e;
    public int f44598f;
    public int f44599g;
    public int h;
    public float f44600i;
    public String f44601j;
    public boolean f44602k;
    public boolean f44603l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f44588m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f44589n = asList2;
        int size = asList.size();
        f44590o = size;
        int size2 = asList2.size();
        f44591p = size2;
        f44592q = size + size2;
        f44593r = new s0[4];
    }

    public s0(int i10) {
        List list;
        int i11 = f44592q;
        this.f44595b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f44508a.size());
        this.f44596c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f44594a = sharedPreferences;
        this.f44598f = sharedPreferences.getInt("brush", 0);
        this.f44600i = sharedPreferences.getFloat("weight", 0.5f);
        this.f44601j = sharedPreferences.getString("typeface", "roboto");
        this.f44599g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f44602k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f44590o) {
            i13 = e2.e((int) sharedPreferences.getLong(i2.g.i(i13, "color_"), ((Integer) f44588m.get(i13)).intValue()), i13, 1, this.f44595b);
        }
        while (true) {
            if (i12 < m.f44508a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(i2.g.i(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static s0 e(int i10) {
        s0[] s0VarArr = f44593r;
        if (s0VarArr[i10] == null) {
            s0VarArr[i10] = new s0(i10);
        }
        return s0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f44588m);
        SharedPreferences.Editor edit = this.f44594a.edit();
        for (int i10 = 0; i10 < m.f44508a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f44596c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f44592q;
        if (i10 >= 0 && i10 < i11) {
            List list = f44589n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f44595b);
            if (i10 >= arrayList.size()) {
                int i12 = f44591p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f44588m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(i2.g.i(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f44598f);
        HashMap hashMap = this.f44596c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f44598f;
            int i10 = this.f44598f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f44508a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f44594a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f44598f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f44589n);
        arrayList.addAll(this.f44595b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f44594a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.f44597e) {
            return;
        }
        SharedPreferences.Editor edit = this.f44594a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f44590o; i10++) {
                String i11 = i2.g.i(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f44588m;
                }
                edit.putLong(i11, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f44595b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f44597e) {
            Integer num = (Integer) this.f44596c.get(Integer.valueOf(this.f44598f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f44598f, num.intValue());
            }
            this.f44597e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f44589n);
        Collection collection = this.f44595b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f44596c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f44598f), Integer.valueOf(b(indexOf)));
                this.f44597e = true;
                return;
            }
            return;
        }
        if (!this.d.isEmpty()) {
            collection = this.d;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.d.clear();
        this.d.add(Integer.valueOf(i10));
        for (int i11 = 0; i11 < arrayList2.size() - 1; i11++) {
            this.d.add((Integer) arrayList2.get(i11));
        }
        int size = this.d.size();
        List list = f44588m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f44598f), Integer.valueOf(i10));
            this.f44597e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f44598f = i10;
        if (z10) {
            this.f44594a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f44596c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f44600i = f7;
        this.f44594a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f44594a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
