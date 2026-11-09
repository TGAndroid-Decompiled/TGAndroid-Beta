package sg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
public final class l0 {
    public static final List f55131m;
    public static final List f55132n;
    public static final int f55133o;
    public static final int f55134p;
    public static final int f55135q;
    public static final l0[] f55136r;
    public final SharedPreferences f55137a;
    public final ArrayList f55138b;
    public final HashMap f55139c;
    public List d;
    public boolean f55140e;
    public int f55141f;
    public int f55142g;
    public int h;
    public float f55143i;
    public String f55144j;
    public boolean f55145k;
    public boolean f55146l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f55131m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f55132n = asList2;
        int size = asList.size();
        f55133o = size;
        int size2 = asList2.size();
        f55134p = size2;
        f55135q = size + size2;
        f55136r = new l0[4];
    }

    public l0(int i7) {
        List list;
        int i10 = f55135q;
        this.f55138b = new ArrayList(i10);
        HashMap hashMap = new HashMap(h.f55074a.size());
        this.f55139c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("photo_color_palette_" + i7, 0);
        this.f55137a = sharedPreferences;
        this.f55141f = sharedPreferences.getInt("brush", 0);
        this.f55143i = sharedPreferences.getFloat("weight", 0.5f);
        this.f55144j = sharedPreferences.getString("typeface", "roboto");
        this.f55142g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f55145k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < f55133o) {
            i12 = com.google.android.recaptcha.internal.a.f((int) sharedPreferences.getLong(jg.g.j(i12, "color_"), ((Integer) f55131m.get(i12)).intValue()), i12, 1, this.f55138b);
        }
        while (true) {
            if (i11 < h.f55074a.size()) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(jg.g.j(i11, "brush_color_"), ((h) list.get(i11)).c())));
                i11++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static l0 e(int i7) {
        l0[] l0VarArr = f55136r;
        if (l0VarArr[i7] == null) {
            l0VarArr[i7] = new l0(i7);
        }
        return l0VarArr[i7];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f55131m);
        SharedPreferences.Editor edit = this.f55137a.edit();
        for (int i7 = 0; i7 < h.f55074a.size(); i7++) {
            edit.remove("brush_color_" + i7);
        }
        edit.remove("brush_color_-1");
        this.f55139c.clear();
        edit.apply();
        g();
    }

    public final int b(int i7) {
        int i10 = f55135q;
        if (i7 >= 0 && i7 < i10) {
            List list = f55132n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f55138b);
            if (i7 >= arrayList.size()) {
                int i11 = f55134p;
                if (i7 < i11) {
                    return ((Integer) list.get(i7)).intValue();
                }
                return ((Integer) f55131m.get(i7 - i11)).intValue();
            }
            return ((Integer) arrayList.get(i7)).intValue();
        }
        throw new IndexOutOfBoundsException(jg.g.j(i10, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f55141f);
        HashMap hashMap = this.f55139c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f55141f;
            int i7 = this.f55141f;
            if (i7 == -1) {
                c10 = -1;
            } else {
                c10 = ((h) h.f55074a.get(i7)).c();
            }
            num = Integer.valueOf((int) this.f55137a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f55141f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f55132n);
        arrayList.addAll(this.f55138b);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((Integer) arrayList.get(i7)).intValue() == c10) {
                return i7;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f55137a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.f55140e) {
            return;
        }
        SharedPreferences.Editor edit = this.f55137a.edit();
        if (!this.d.isEmpty()) {
            for (int i7 = 0; i7 < f55133o; i7++) {
                String j3 = jg.g.j(i7, "color_");
                if (i7 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f55131m;
                }
                edit.putLong(j3, ((Integer) list.get(i7)).intValue());
            }
            ArrayList arrayList = this.f55138b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f55140e) {
            if (((Integer) this.f55139c.get(Integer.valueOf(this.f55141f))) != null) {
                edit.putLong("brush_color_" + this.f55141f, num.intValue());
            }
            this.f55140e = false;
        }
        edit.apply();
    }

    public final void h(int i7, boolean z9) {
        ArrayList arrayList = new ArrayList(f55132n);
        Collection collection = this.f55138b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i7));
        HashMap hashMap = this.f55139c;
        if (indexOf != -1) {
            if (z9) {
                hashMap.put(Integer.valueOf(this.f55141f), Integer.valueOf(b(indexOf)));
                this.f55140e = true;
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
        List list = f55131m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z9) {
            hashMap.put(Integer.valueOf(this.f55141f), Integer.valueOf(i7));
            this.f55140e = true;
        }
    }

    public final void i(int i7, boolean z9) {
        this.f55141f = i7;
        if (z9) {
            this.f55137a.edit().putInt("brush", i7).apply();
        }
        Integer num = (Integer) this.f55139c.get(Integer.valueOf(i7));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f55143i = f10;
        this.f55137a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f55137a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
