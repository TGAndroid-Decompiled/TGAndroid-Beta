package sg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
public final class l0 {
    public static final List f55029m;
    public static final List f55030n;
    public static final int f55031o;
    public static final int f55032p;
    public static final int f55033q;
    public static final l0[] f55034r;
    public final SharedPreferences f55035a;
    public final ArrayList f55036b;
    public final HashMap f55037c;
    public List d;
    public boolean f55038e;
    public int f55039f;
    public int f55040g;
    public int h;
    public float f55041i;
    public String f55042j;
    public boolean f55043k;
    public boolean f55044l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f55029m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f55030n = asList2;
        int size = asList.size();
        f55031o = size;
        int size2 = asList2.size();
        f55032p = size2;
        f55033q = size + size2;
        f55034r = new l0[4];
    }

    public l0(int i7) {
        List list;
        int i10 = f55033q;
        this.f55036b = new ArrayList(i10);
        HashMap hashMap = new HashMap(h.f54968a.size());
        this.f55037c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("photo_color_palette_" + i7, 0);
        this.f55035a = sharedPreferences;
        this.f55039f = sharedPreferences.getInt("brush", 0);
        this.f55041i = sharedPreferences.getFloat("weight", 0.5f);
        this.f55042j = sharedPreferences.getString("typeface", "roboto");
        this.f55040g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f55043k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < f55031o) {
            i12 = com.google.android.recaptcha.internal.a.f((int) sharedPreferences.getLong(jg.g.j(i12, "color_"), ((Integer) f55029m.get(i12)).intValue()), i12, 1, this.f55036b);
        }
        while (true) {
            if (i11 < h.f54968a.size()) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(jg.g.j(i11, "brush_color_"), ((h) list.get(i11)).c())));
                i11++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static l0 e(int i7) {
        l0[] l0VarArr = f55034r;
        if (l0VarArr[i7] == null) {
            l0VarArr[i7] = new l0(i7);
        }
        return l0VarArr[i7];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f55029m);
        SharedPreferences.Editor edit = this.f55035a.edit();
        for (int i7 = 0; i7 < h.f54968a.size(); i7++) {
            edit.remove("brush_color_" + i7);
        }
        edit.remove("brush_color_-1");
        this.f55037c.clear();
        edit.apply();
        g();
    }

    public final int b(int i7) {
        int i10 = f55033q;
        if (i7 >= 0 && i7 < i10) {
            List list = f55030n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f55036b);
            if (i7 >= arrayList.size()) {
                int i11 = f55032p;
                if (i7 < i11) {
                    return ((Integer) list.get(i7)).intValue();
                }
                return ((Integer) f55029m.get(i7 - i11)).intValue();
            }
            return ((Integer) arrayList.get(i7)).intValue();
        }
        throw new IndexOutOfBoundsException(jg.g.j(i10, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f55039f);
        HashMap hashMap = this.f55037c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f55039f;
            int i7 = this.f55039f;
            if (i7 == -1) {
                c10 = -1;
            } else {
                c10 = ((h) h.f54968a.get(i7)).c();
            }
            num = Integer.valueOf((int) this.f55035a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f55039f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f55030n);
        arrayList.addAll(this.f55036b);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((Integer) arrayList.get(i7)).intValue() == c10) {
                return i7;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f55035a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.f55038e) {
            return;
        }
        SharedPreferences.Editor edit = this.f55035a.edit();
        if (!this.d.isEmpty()) {
            for (int i7 = 0; i7 < f55031o; i7++) {
                String j3 = jg.g.j(i7, "color_");
                if (i7 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f55029m;
                }
                edit.putLong(j3, ((Integer) list.get(i7)).intValue());
            }
            ArrayList arrayList = this.f55036b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f55038e) {
            if (((Integer) this.f55037c.get(Integer.valueOf(this.f55039f))) != null) {
                edit.putLong("brush_color_" + this.f55039f, num.intValue());
            }
            this.f55038e = false;
        }
        edit.apply();
    }

    public final void h(int i7, boolean z9) {
        ArrayList arrayList = new ArrayList(f55030n);
        Collection collection = this.f55036b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i7));
        HashMap hashMap = this.f55037c;
        if (indexOf != -1) {
            if (z9) {
                hashMap.put(Integer.valueOf(this.f55039f), Integer.valueOf(b(indexOf)));
                this.f55038e = true;
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
        List list = f55029m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z9) {
            hashMap.put(Integer.valueOf(this.f55039f), Integer.valueOf(i7));
            this.f55038e = true;
        }
    }

    public final void i(int i7, boolean z9) {
        this.f55039f = i7;
        if (z9) {
            this.f55035a.edit().putInt("brush", i7).apply();
        }
        Integer num = (Integer) this.f55037c.get(Integer.valueOf(i7));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f55041i = f10;
        this.f55035a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f55035a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
