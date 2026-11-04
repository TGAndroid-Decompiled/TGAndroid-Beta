package tg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import k2.p1;
public final class k0 {
    public static final List f55223m;
    public static final List f55224n;
    public static final int f55225o;
    public static final int f55226p;
    public static final int f55227q;
    public static final k0[] f55228r;
    public final SharedPreferences f55229a;
    public final ArrayList f55230b;
    public final HashMap f55231c;
    public List d;
    public boolean f55232e;
    public int f55233f;
    public int f55234g;
    public int h;
    public float f55235i;
    public String f55236j;
    public boolean f55237k;
    public boolean f55238l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f55223m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f55224n = asList2;
        int size = asList.size();
        f55225o = size;
        int size2 = asList2.size();
        f55226p = size2;
        f55227q = size + size2;
        f55228r = new k0[4];
    }

    public k0(int i3) {
        List list;
        int i10 = f55227q;
        this.f55230b = new ArrayList(i10);
        HashMap hashMap = new HashMap(h.f55183a.size());
        this.f55231c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("photo_color_palette_" + i3, 0);
        this.f55229a = sharedPreferences;
        this.f55233f = sharedPreferences.getInt("brush", 0);
        this.f55235i = sharedPreferences.getFloat("weight", 0.5f);
        this.f55236j = sharedPreferences.getString("typeface", "roboto");
        this.f55234g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f55237k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < f55225o) {
            i12 = com.google.android.recaptcha.internal.a.f((int) sharedPreferences.getLong(p1.i(i12, "color_"), ((Integer) f55223m.get(i12)).intValue()), i12, 1, this.f55230b);
        }
        while (true) {
            if (i11 < h.f55183a.size()) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(p1.i(i11, "brush_color_"), ((h) list.get(i11)).c())));
                i11++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static k0 e(int i3) {
        k0[] k0VarArr = f55228r;
        if (k0VarArr[i3] == null) {
            k0VarArr[i3] = new k0(i3);
        }
        return k0VarArr[i3];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f55223m);
        SharedPreferences.Editor edit = this.f55229a.edit();
        for (int i3 = 0; i3 < h.f55183a.size(); i3++) {
            edit.remove("brush_color_" + i3);
        }
        edit.remove("brush_color_-1");
        this.f55231c.clear();
        edit.apply();
        g();
    }

    public final int b(int i3) {
        int i10 = f55227q;
        if (i3 >= 0 && i3 < i10) {
            List list = f55224n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f55230b);
            if (i3 >= arrayList.size()) {
                int i11 = f55226p;
                if (i3 < i11) {
                    return ((Integer) list.get(i3)).intValue();
                }
                return ((Integer) f55223m.get(i3 - i11)).intValue();
            }
            return ((Integer) arrayList.get(i3)).intValue();
        }
        throw new IndexOutOfBoundsException(p1.i(i10, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c2;
        Integer valueOf = Integer.valueOf(this.f55233f);
        HashMap hashMap = this.f55231c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f55233f;
            int i3 = this.f55233f;
            if (i3 == -1) {
                c2 = -1;
            } else {
                c2 = ((h) h.f55183a.get(i3)).c();
            }
            num = Integer.valueOf((int) this.f55229a.getLong(str, c2));
            hashMap.put(Integer.valueOf(this.f55233f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c2 = c();
        ArrayList arrayList = new ArrayList(f55224n);
        arrayList.addAll(this.f55230b);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((Integer) arrayList.get(i3)).intValue() == c2) {
                return i3;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f55229a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.f55232e) {
            return;
        }
        SharedPreferences.Editor edit = this.f55229a.edit();
        if (!this.d.isEmpty()) {
            for (int i3 = 0; i3 < f55225o; i3++) {
                String i10 = p1.i(i3, "color_");
                if (i3 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f55223m;
                }
                edit.putLong(i10, ((Integer) list.get(i3)).intValue());
            }
            ArrayList arrayList = this.f55230b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f55232e) {
            if (((Integer) this.f55231c.get(Integer.valueOf(this.f55233f))) != null) {
                edit.putLong("brush_color_" + this.f55233f, num.intValue());
            }
            this.f55232e = false;
        }
        edit.apply();
    }

    public final void h(int i3, boolean z10) {
        ArrayList arrayList = new ArrayList(f55224n);
        Collection collection = this.f55230b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i3));
        HashMap hashMap = this.f55231c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f55233f), Integer.valueOf(b(indexOf)));
                this.f55232e = true;
                return;
            }
            return;
        }
        if (!this.d.isEmpty()) {
            collection = this.d;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.d.clear();
        this.d.add(Integer.valueOf(i3));
        for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
            this.d.add((Integer) arrayList2.get(i10));
        }
        int size = this.d.size();
        List list = f55223m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f55233f), Integer.valueOf(i3));
            this.f55232e = true;
        }
    }

    public final void i(int i3, boolean z10) {
        this.f55233f = i3;
        if (z10) {
            this.f55229a.edit().putInt("brush", i3).apply();
        }
        Integer num = (Integer) this.f55231c.get(Integer.valueOf(i3));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f55235i = f10;
        this.f55229a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f55229a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
