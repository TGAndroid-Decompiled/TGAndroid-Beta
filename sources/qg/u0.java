package qg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class u0 {
    public static final List f44706m;
    public static final List f44707n;
    public static final int f44708o;
    public static final int f44709p;
    public static final int f44710q;
    public static final u0[] f44711r;
    public final SharedPreferences f44712a;
    public final ArrayList f44713b;
    public final HashMap f44714c;
    public List d;
    public boolean e;
    public int f44715f;
    public int f44716g;
    public int h;
    public float f44717i;
    public String f44718j;
    public boolean f44719k;
    public boolean f44720l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f44706m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f44707n = asList2;
        int size = asList.size();
        f44708o = size;
        int size2 = asList2.size();
        f44709p = size2;
        f44710q = size + size2;
        f44711r = new u0[4];
    }

    public u0(int i10) {
        List list;
        int i11 = f44710q;
        this.f44713b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f44605a.size());
        this.f44714c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f44712a = sharedPreferences;
        this.f44715f = sharedPreferences.getInt("brush", 0);
        this.f44717i = sharedPreferences.getFloat("weight", 0.5f);
        this.f44718j = sharedPreferences.getString("typeface", "roboto");
        this.f44716g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f44719k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f44708o) {
            i13 = k3.f((int) sharedPreferences.getLong(i2.d.j(i13, "color_"), ((Integer) f44706m.get(i13)).intValue()), i13, 1, this.f44713b);
        }
        while (true) {
            if (i12 < m.f44605a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(i2.d.j(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static u0 e(int i10) {
        u0[] u0VarArr = f44711r;
        if (u0VarArr[i10] == null) {
            u0VarArr[i10] = new u0(i10);
        }
        return u0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f44706m);
        SharedPreferences.Editor edit = this.f44712a.edit();
        for (int i10 = 0; i10 < m.f44605a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f44714c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f44710q;
        if (i10 >= 0 && i10 < i11) {
            List list = f44707n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f44713b);
            if (i10 >= arrayList.size()) {
                int i12 = f44709p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f44706m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(i2.d.j(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f44715f);
        HashMap hashMap = this.f44714c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f44715f;
            int i10 = this.f44715f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f44605a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f44712a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f44715f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f44707n);
        arrayList.addAll(this.f44713b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f44712a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f44712a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f44708o; i10++) {
                String j10 = i2.d.j(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f44706m;
                }
                edit.putLong(j10, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f44713b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            if (((Integer) this.f44714c.get(Integer.valueOf(this.f44715f))) != null) {
                edit.putLong("brush_color_" + this.f44715f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f44707n);
        Collection collection = this.f44713b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f44714c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f44715f), Integer.valueOf(b(indexOf)));
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
        List list = f44706m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f44715f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f44715f = i10;
        if (z10) {
            this.f44712a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f44714c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f44717i = f7;
        this.f44712a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f44712a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
