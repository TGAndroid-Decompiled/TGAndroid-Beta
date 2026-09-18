package pg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class s0 {
    public static final List f41013m;
    public static final List f41014n;
    public static final int f41015o;
    public static final int f41016p;
    public static final int f41017q;
    public static final s0[] f41018r;
    public final SharedPreferences f41019a;
    public final ArrayList f41020b;
    public final HashMap f41021c;
    public List d;
    public boolean e;
    public int f41022f;
    public int f41023g;
    public int h;
    public float f41024i;
    public String f41025j;
    public boolean f41026k;
    public boolean f41027l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f41013m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f41014n = asList2;
        int size = asList.size();
        f41015o = size;
        int size2 = asList2.size();
        f41016p = size2;
        f41017q = size + size2;
        f41018r = new s0[4];
    }

    public s0(int i10) {
        List list;
        int i11 = f41017q;
        this.f41020b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f40939a.size());
        this.f41021c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f41019a = sharedPreferences;
        this.f41022f = sharedPreferences.getInt("brush", 0);
        this.f41024i = sharedPreferences.getFloat("weight", 0.5f);
        this.f41025j = sharedPreferences.getString("typeface", "roboto");
        this.f41023g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f41026k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f41015o) {
            i13 = e2.e((int) sharedPreferences.getLong(hg.k0.i(i13, "color_"), ((Integer) f41013m.get(i13)).intValue()), i13, 1, this.f41020b);
        }
        while (true) {
            if (i12 < m.f40939a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(hg.k0.i(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static s0 e(int i10) {
        s0[] s0VarArr = f41018r;
        if (s0VarArr[i10] == null) {
            s0VarArr[i10] = new s0(i10);
        }
        return s0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f41013m);
        SharedPreferences.Editor edit = this.f41019a.edit();
        for (int i10 = 0; i10 < m.f40939a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f41021c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f41017q;
        if (i10 >= 0 && i10 < i11) {
            List list = f41014n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f41020b);
            if (i10 >= arrayList.size()) {
                int i12 = f41016p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f41013m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(hg.k0.i(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f41022f);
        HashMap hashMap = this.f41021c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f41022f;
            int i10 = this.f41022f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f40939a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f41019a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f41022f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f41014n);
        arrayList.addAll(this.f41020b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f41019a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f41019a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f41015o; i10++) {
                String i11 = hg.k0.i(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f41013m;
                }
                edit.putLong(i11, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f41020b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            Integer num = (Integer) this.f41021c.get(Integer.valueOf(this.f41022f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f41022f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f41014n);
        Collection collection = this.f41020b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f41021c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f41022f), Integer.valueOf(b(indexOf)));
                this.e = true;
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
        List list = f41013m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f41022f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f41022f = i10;
        if (z10) {
            this.f41019a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f41021c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f41024i = f7;
        this.f41019a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f41019a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
