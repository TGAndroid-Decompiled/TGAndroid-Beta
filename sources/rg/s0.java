package rg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class s0 {
    public static final List f47534m;
    public static final List f47535n;
    public static final int f47536o;
    public static final int f47537p;
    public static final int f47538q;
    public static final s0[] f47539r;
    public final SharedPreferences f47540a;
    public final ArrayList f47541b;
    public final HashMap f47542c;
    public List d;
    public boolean e;
    public int f47543f;
    public int f47544g;
    public int h;
    public float f47545i;
    public String f47546j;
    public boolean f47547k;
    public boolean f47548l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f47534m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f47535n = asList2;
        int size = asList.size();
        f47536o = size;
        int size2 = asList2.size();
        f47537p = size2;
        f47538q = size + size2;
        f47539r = new s0[4];
    }

    public s0(int i10) {
        List list;
        int i11 = f47538q;
        this.f47541b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f47462a.size());
        this.f47542c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f47540a = sharedPreferences;
        this.f47543f = sharedPreferences.getInt("brush", 0);
        this.f47545i = sharedPreferences.getFloat("weight", 0.5f);
        this.f47546j = sharedPreferences.getString("typeface", "roboto");
        this.f47544g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f47547k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f47536o) {
            i13 = c3.h0.i((int) sharedPreferences.getLong(ic.a.i(i13, "color_"), ((Integer) f47534m.get(i13)).intValue()), i13, 1, this.f47541b);
        }
        while (true) {
            if (i12 < m.f47462a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(ic.a.i(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static s0 e(int i10) {
        s0[] s0VarArr = f47539r;
        if (s0VarArr[i10] == null) {
            s0VarArr[i10] = new s0(i10);
        }
        return s0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f47534m);
        SharedPreferences.Editor edit = this.f47540a.edit();
        for (int i10 = 0; i10 < m.f47462a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f47542c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f47538q;
        if (i10 >= 0 && i10 < i11) {
            List list = f47535n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f47541b);
            if (i10 >= arrayList.size()) {
                int i12 = f47537p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f47534m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(ic.a.i(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f47543f);
        HashMap hashMap = this.f47542c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f47543f;
            int i10 = this.f47543f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f47462a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f47540a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f47543f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f47535n);
        arrayList.addAll(this.f47541b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f47540a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f47540a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f47536o; i10++) {
                String i11 = ic.a.i(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f47534m;
                }
                edit.putLong(i11, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f47541b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            if (((Integer) this.f47542c.get(Integer.valueOf(this.f47543f))) != null) {
                edit.putLong("brush_color_" + this.f47543f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f47535n);
        Collection collection = this.f47541b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f47542c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f47543f), Integer.valueOf(b(indexOf)));
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
        List list = f47534m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f47543f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f47543f = i10;
        if (z10) {
            this.f47540a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f47542c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f47545i = f7;
        this.f47540a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f47540a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
