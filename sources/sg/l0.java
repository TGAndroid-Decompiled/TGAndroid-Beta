package sg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
public final class l0 {
    public static final List f55004m;
    public static final List f55005n;
    public static final int f55006o;
    public static final int f55007p;
    public static final int f55008q;
    public static final l0[] f55009r;
    public final SharedPreferences f55010a;
    public final ArrayList f55011b;
    public final HashMap f55012c;
    public List d;
    public boolean f55013e;
    public int f55014f;
    public int f55015g;
    public int h;
    public float f55016i;
    public String f55017j;
    public boolean f55018k;
    public boolean f55019l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f55004m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f55005n = asList2;
        int size = asList.size();
        f55006o = size;
        int size2 = asList2.size();
        f55007p = size2;
        f55008q = size + size2;
        f55009r = new l0[4];
    }

    public l0(int i7) {
        List list;
        int i10 = f55008q;
        this.f55011b = new ArrayList(i10);
        HashMap hashMap = new HashMap(h.f54943a.size());
        this.f55012c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("photo_color_palette_" + i7, 0);
        this.f55010a = sharedPreferences;
        this.f55014f = sharedPreferences.getInt("brush", 0);
        this.f55016i = sharedPreferences.getFloat("weight", 0.5f);
        this.f55017j = sharedPreferences.getString("typeface", "roboto");
        this.f55015g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f55018k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < f55006o) {
            i12 = com.google.android.recaptcha.internal.a.f((int) sharedPreferences.getLong(jg.g.j(i12, "color_"), ((Integer) f55004m.get(i12)).intValue()), i12, 1, this.f55011b);
        }
        while (true) {
            if (i11 < h.f54943a.size()) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(jg.g.j(i11, "brush_color_"), ((h) list.get(i11)).c())));
                i11++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static l0 e(int i7) {
        l0[] l0VarArr = f55009r;
        if (l0VarArr[i7] == null) {
            l0VarArr[i7] = new l0(i7);
        }
        return l0VarArr[i7];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f55004m);
        SharedPreferences.Editor edit = this.f55010a.edit();
        for (int i7 = 0; i7 < h.f54943a.size(); i7++) {
            edit.remove("brush_color_" + i7);
        }
        edit.remove("brush_color_-1");
        this.f55012c.clear();
        edit.apply();
        g();
    }

    public final int b(int i7) {
        int i10 = f55008q;
        if (i7 >= 0 && i7 < i10) {
            List list = f55005n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f55011b);
            if (i7 >= arrayList.size()) {
                int i11 = f55007p;
                if (i7 < i11) {
                    return ((Integer) list.get(i7)).intValue();
                }
                return ((Integer) f55004m.get(i7 - i11)).intValue();
            }
            return ((Integer) arrayList.get(i7)).intValue();
        }
        throw new IndexOutOfBoundsException(jg.g.j(i10, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f55014f);
        HashMap hashMap = this.f55012c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f55014f;
            int i7 = this.f55014f;
            if (i7 == -1) {
                c10 = -1;
            } else {
                c10 = ((h) h.f54943a.get(i7)).c();
            }
            num = Integer.valueOf((int) this.f55010a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f55014f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f55005n);
        arrayList.addAll(this.f55011b);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((Integer) arrayList.get(i7)).intValue() == c10) {
                return i7;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f55010a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.f55013e) {
            return;
        }
        SharedPreferences.Editor edit = this.f55010a.edit();
        if (!this.d.isEmpty()) {
            for (int i7 = 0; i7 < f55006o; i7++) {
                String j3 = jg.g.j(i7, "color_");
                if (i7 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f55004m;
                }
                edit.putLong(j3, ((Integer) list.get(i7)).intValue());
            }
            ArrayList arrayList = this.f55011b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f55013e) {
            if (((Integer) this.f55012c.get(Integer.valueOf(this.f55014f))) != null) {
                edit.putLong("brush_color_" + this.f55014f, num.intValue());
            }
            this.f55013e = false;
        }
        edit.apply();
    }

    public final void h(int i7, boolean z9) {
        ArrayList arrayList = new ArrayList(f55005n);
        Collection collection = this.f55011b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i7));
        HashMap hashMap = this.f55012c;
        if (indexOf != -1) {
            if (z9) {
                hashMap.put(Integer.valueOf(this.f55014f), Integer.valueOf(b(indexOf)));
                this.f55013e = true;
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
        List list = f55004m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z9) {
            hashMap.put(Integer.valueOf(this.f55014f), Integer.valueOf(i7));
            this.f55013e = true;
        }
    }

    public final void i(int i7, boolean z9) {
        this.f55014f = i7;
        if (z9) {
            this.f55010a.edit().putInt("brush", i7).apply();
        }
        Integer num = (Integer) this.f55012c.get(Integer.valueOf(i7));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f55016i = f10;
        this.f55010a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f55010a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
