package sg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
public final class k0 {
    public static final List f57296m;
    public static final List f57297n;
    public static final int f57298o;
    public static final int f57299p;
    public static final int f57300q;
    public static final k0[] f57301r;
    public final SharedPreferences f57302a;
    public final ArrayList f57303b;
    public final HashMap f57304c;
    public List d;
    public boolean f57305e;
    public int f57306f;
    public int f57307g;
    public int h;
    public float f57308i;
    public String f57309j;
    public boolean f57310k;
    public boolean f57311l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f57296m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f57297n = asList2;
        int size = asList.size();
        f57298o = size;
        int size2 = asList2.size();
        f57299p = size2;
        f57300q = size + size2;
        f57301r = new k0[4];
    }

    public k0(int i7) {
        List list;
        int i10 = f57300q;
        this.f57303b = new ArrayList(i10);
        HashMap hashMap = new HashMap(h.f57255a.size());
        this.f57304c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26941b.getSharedPreferences("photo_color_palette_" + i7, 0);
        this.f57302a = sharedPreferences;
        this.f57306f = sharedPreferences.getInt("brush", 0);
        this.f57308i = sharedPreferences.getFloat("weight", 0.5f);
        this.f57309j = sharedPreferences.getString("typeface", "roboto");
        this.f57307g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f57310k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < f57298o) {
            i12 = e2.f((int) sharedPreferences.getLong(i5.c.i(i12, "color_"), ((Integer) f57296m.get(i12)).intValue()), i12, 1, this.f57303b);
        }
        while (true) {
            if (i11 < h.f57255a.size()) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(i5.c.i(i11, "brush_color_"), ((h) list.get(i11)).c())));
                i11++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static k0 e(int i7) {
        k0[] k0VarArr = f57301r;
        if (k0VarArr[i7] == null) {
            k0VarArr[i7] = new k0(i7);
        }
        return k0VarArr[i7];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f57296m);
        SharedPreferences.Editor edit = this.f57302a.edit();
        for (int i7 = 0; i7 < h.f57255a.size(); i7++) {
            edit.remove("brush_color_" + i7);
        }
        edit.remove("brush_color_-1");
        this.f57304c.clear();
        edit.apply();
        g();
    }

    public final int b(int i7) {
        int i10 = f57300q;
        if (i7 >= 0 && i7 < i10) {
            List list = f57297n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f57303b);
            if (i7 >= arrayList.size()) {
                int i11 = f57299p;
                if (i7 < i11) {
                    return ((Integer) list.get(i7)).intValue();
                }
                return ((Integer) f57296m.get(i7 - i11)).intValue();
            }
            return ((Integer) arrayList.get(i7)).intValue();
        }
        throw new IndexOutOfBoundsException(i5.c.i(i10, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f57306f);
        HashMap hashMap = this.f57304c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f57306f;
            int i7 = this.f57306f;
            if (i7 == -1) {
                c10 = -1;
            } else {
                c10 = ((h) h.f57255a.get(i7)).c();
            }
            num = Integer.valueOf((int) this.f57302a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f57306f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f57297n);
        arrayList.addAll(this.f57303b);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((Integer) arrayList.get(i7)).intValue() == c10) {
                return i7;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f57302a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.f57305e) {
            return;
        }
        SharedPreferences.Editor edit = this.f57302a.edit();
        if (!this.d.isEmpty()) {
            for (int i7 = 0; i7 < f57298o; i7++) {
                String i10 = i5.c.i(i7, "color_");
                if (i7 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f57296m;
                }
                edit.putLong(i10, ((Integer) list.get(i7)).intValue());
            }
            ArrayList arrayList = this.f57303b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f57305e) {
            if (((Integer) this.f57304c.get(Integer.valueOf(this.f57306f))) != null) {
                edit.putLong("brush_color_" + this.f57306f, num.intValue());
            }
            this.f57305e = false;
        }
        edit.apply();
    }

    public final void h(int i7, boolean z10) {
        ArrayList arrayList = new ArrayList(f57297n);
        Collection collection = this.f57303b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i7));
        HashMap hashMap = this.f57304c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f57306f), Integer.valueOf(b(indexOf)));
                this.f57305e = true;
                return;
            }
            return;
        }
        if (!this.d.isEmpty()) {
            collection = this.d;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.d.clear();
        this.d.add(Integer.valueOf(i7));
        for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
            this.d.add((Integer) arrayList2.get(i10));
        }
        int size = this.d.size();
        List list = f57296m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f57306f), Integer.valueOf(i7));
            this.f57305e = true;
        }
    }

    public final void i(int i7, boolean z10) {
        this.f57306f = i7;
        if (z10) {
            this.f57302a.edit().putInt("brush", i7).apply();
        }
        Integer num = (Integer) this.f57304c.get(Integer.valueOf(i7));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f57308i = f10;
        this.f57302a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f57302a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
