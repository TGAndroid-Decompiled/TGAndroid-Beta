package pg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class u0 {
    public static final List f41256m;
    public static final List f41257n;
    public static final int f41258o;
    public static final int f41259p;
    public static final int f41260q;
    public static final u0[] f41261r;
    public final SharedPreferences f41262a;
    public final ArrayList f41263b;
    public final HashMap f41264c;
    public List d;
    public boolean e;
    public int f41265f;
    public int f41266g;
    public int h;
    public float f41267i;
    public String f41268j;
    public boolean f41269k;
    public boolean f41270l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f41256m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f41257n = asList2;
        int size = asList.size();
        f41258o = size;
        int size2 = asList2.size();
        f41259p = size2;
        f41260q = size + size2;
        f41261r = new u0[4];
    }

    public u0(int i10) {
        List list;
        int i11 = f41260q;
        this.f41263b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f41158a.size());
        this.f41264c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f41262a = sharedPreferences;
        this.f41265f = sharedPreferences.getInt("brush", 0);
        this.f41267i = sharedPreferences.getFloat("weight", 0.5f);
        this.f41268j = sharedPreferences.getString("typeface", "roboto");
        this.f41266g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f41269k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f41258o) {
            i13 = e2.e((int) sharedPreferences.getLong(hg.k0.h(i13, "color_"), ((Integer) f41256m.get(i13)).intValue()), i13, 1, this.f41263b);
        }
        while (true) {
            if (i12 < m.f41158a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(hg.k0.h(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static u0 e(int i10) {
        u0[] u0VarArr = f41261r;
        if (u0VarArr[i10] == null) {
            u0VarArr[i10] = new u0(i10);
        }
        return u0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f41256m);
        SharedPreferences.Editor edit = this.f41262a.edit();
        for (int i10 = 0; i10 < m.f41158a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f41264c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f41260q;
        if (i10 >= 0 && i10 < i11) {
            List list = f41257n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f41263b);
            if (i10 >= arrayList.size()) {
                int i12 = f41259p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f41256m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(hg.k0.h(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f41265f);
        HashMap hashMap = this.f41264c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f41265f;
            int i10 = this.f41265f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f41158a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f41262a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f41265f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f41257n);
        arrayList.addAll(this.f41263b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f41262a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f41262a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f41258o; i10++) {
                String h = hg.k0.h(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f41256m;
                }
                edit.putLong(h, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f41263b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            Integer num = (Integer) this.f41264c.get(Integer.valueOf(this.f41265f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f41265f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f41257n);
        Collection collection = this.f41263b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f41264c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f41265f), Integer.valueOf(b(indexOf)));
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
        List list = f41256m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f41265f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f41265f = i10;
        if (z10) {
            this.f41262a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f41264c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f41267i = f7;
        this.f41262a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f41262a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
