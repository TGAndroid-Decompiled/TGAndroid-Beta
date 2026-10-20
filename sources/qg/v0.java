package qg;

import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class v0 {
    public static final List f44671m;
    public static final List f44672n;
    public static final int f44673o;
    public static final int f44674p;
    public static final int f44675q;
    public static final v0[] f44676r;
    public final SharedPreferences f44677a;
    public final ArrayList f44678b;
    public final HashMap f44679c;
    public List d;
    public boolean e;
    public int f44680f;
    public int f44681g;
    public int h;
    public float f44682i;
    public String f44683j;
    public boolean f44684k;
    public boolean f44685l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f44671m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f44672n = asList2;
        int size = asList.size();
        f44673o = size;
        int size2 = asList2.size();
        f44674p = size2;
        f44675q = size + size2;
        f44676r = new v0[4];
    }

    public v0(int i10) {
        List list;
        int i11 = f44675q;
        this.f44678b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f44561a.size());
        this.f44679c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f44677a = sharedPreferences;
        this.f44680f = sharedPreferences.getInt("brush", 0);
        this.f44682i = sharedPreferences.getFloat("weight", 0.5f);
        this.f44683j = sharedPreferences.getString("typeface", "roboto");
        this.f44681g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f44684k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f44673o) {
            i13 = k3.f((int) sharedPreferences.getLong(i2.e.j(i13, "color_"), ((Integer) f44671m.get(i13)).intValue()), i13, 1, this.f44678b);
        }
        while (true) {
            if (i12 < m.f44561a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(i2.e.j(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static v0 e(int i10) {
        v0[] v0VarArr = f44676r;
        if (v0VarArr[i10] == null) {
            v0VarArr[i10] = new v0(i10);
        }
        return v0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f44671m);
        SharedPreferences.Editor edit = this.f44677a.edit();
        for (int i10 = 0; i10 < m.f44561a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f44679c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f44675q;
        if (i10 >= 0 && i10 < i11) {
            List list = f44672n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f44678b);
            if (i10 >= arrayList.size()) {
                int i12 = f44674p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f44671m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(i2.e.j(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f44680f);
        HashMap hashMap = this.f44679c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f44680f;
            int i10 = this.f44680f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f44561a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f44677a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f44680f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f44672n);
        arrayList.addAll(this.f44678b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f44677a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f44677a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f44673o; i10++) {
                String j10 = i2.e.j(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f44671m;
                }
                edit.putLong(j10, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f44678b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            if (((Integer) this.f44679c.get(Integer.valueOf(this.f44680f))) != null) {
                edit.putLong("brush_color_" + this.f44680f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f44672n);
        Collection collection = this.f44678b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f44679c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f44680f), Integer.valueOf(b(indexOf)));
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
        List list = f44671m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f44680f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f44680f = i10;
        if (z10) {
            this.f44677a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f44679c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f44682i = f7;
        this.f44677a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f44677a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
