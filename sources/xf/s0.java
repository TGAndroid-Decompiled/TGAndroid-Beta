package xf;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class s0 {
    public static final List f49352m;
    public static final List f49353n;
    public static final int f49354o;
    public static final int f49355p;
    public static final int f49356q;
    public static final s0[] f49357r;
    public final SharedPreferences f49358a;
    public final ArrayList f49359b;
    public final HashMap f49360c;
    public List d;
    public boolean f49361e;
    public int f49362f;
    public int f49363g;
    public int h;
    public float f49364i;
    public String f49365j;
    public boolean f49366k;
    public boolean f49367l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f49352m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f49353n = asList2;
        int size = asList.size();
        f49354o = size;
        int size2 = asList2.size();
        f49355p = size2;
        f49356q = size + size2;
        f49357r = new s0[4];
    }

    public s0(int i9) {
        List list;
        int i10 = f49356q;
        this.f49359b = new ArrayList(i10);
        HashMap hashMap = new HashMap(m.f49272a.size());
        this.f49360c = hashMap;
        this.d = new ArrayList(i10);
        int i11 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i9, 0);
        this.f49358a = sharedPreferences;
        this.f49362f = sharedPreferences.getInt("brush", 0);
        this.f49364i = sharedPreferences.getFloat("weight", 0.5f);
        this.f49365j = sharedPreferences.getString("typeface", "roboto");
        this.f49363g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f49366k = sharedPreferences.getBoolean("fill_shapes", false);
        int i12 = 0;
        while (i12 < f49354o) {
            i12 = j3.r0.e((int) sharedPreferences.getLong(j3.r0.l(i12, "color_"), ((Integer) f49352m.get(i12)).intValue()), i12, 1, this.f49359b);
        }
        while (true) {
            if (i11 < m.f49272a.size()) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf((int) sharedPreferences.getLong(j3.r0.l(i11, "brush_color_"), ((m) list.get(i11)).c())));
                i11++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static s0 e(int i9) {
        s0[] s0VarArr = f49357r;
        if (s0VarArr[i9] == null) {
            s0VarArr[i9] = new s0(i9);
        }
        return s0VarArr[i9];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f49352m);
        SharedPreferences.Editor edit = this.f49358a.edit();
        for (int i9 = 0; i9 < m.f49272a.size(); i9++) {
            edit.remove("brush_color_" + i9);
        }
        edit.remove("brush_color_-1");
        this.f49360c.clear();
        edit.apply();
        g();
    }

    public final int b(int i9) {
        int i10 = f49356q;
        if (i9 >= 0 && i9 < i10) {
            List list = f49353n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f49359b);
            if (i9 >= arrayList.size()) {
                int i11 = f49355p;
                if (i9 < i11) {
                    return ((Integer) list.get(i9)).intValue();
                }
                return ((Integer) f49352m.get(i9 - i11)).intValue();
            }
            return ((Integer) arrayList.get(i9)).intValue();
        }
        throw new IndexOutOfBoundsException(j3.r0.l(i10, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f49362f);
        HashMap hashMap = this.f49360c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f49362f;
            int i9 = this.f49362f;
            if (i9 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f49272a.get(i9)).c();
            }
            num = Integer.valueOf((int) this.f49358a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f49362f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f49353n);
        arrayList.addAll(this.f49359b);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((Integer) arrayList.get(i9)).intValue() == c10) {
                return i9;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f49358a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.f49361e) {
            return;
        }
        SharedPreferences.Editor edit = this.f49358a.edit();
        if (!this.d.isEmpty()) {
            for (int i9 = 0; i9 < f49354o; i9++) {
                String l10 = j3.r0.l(i9, "color_");
                if (i9 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f49352m;
                }
                edit.putLong(l10, ((Integer) list.get(i9)).intValue());
            }
            ArrayList arrayList = this.f49359b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f49361e) {
            Integer num = (Integer) this.f49360c.get(Integer.valueOf(this.f49362f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f49362f, num.intValue());
            }
            this.f49361e = false;
        }
        edit.apply();
    }

    public final void h(int i9, boolean z10) {
        ArrayList arrayList = new ArrayList(f49353n);
        Collection collection = this.f49359b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i9));
        HashMap hashMap = this.f49360c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f49362f), Integer.valueOf(b(indexOf)));
                this.f49361e = true;
                return;
            }
            return;
        }
        if (!this.d.isEmpty()) {
            collection = this.d;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.d.clear();
        this.d.add(Integer.valueOf(i9));
        for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
            this.d.add((Integer) arrayList2.get(i10));
        }
        int size = this.d.size();
        List list = f49352m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f49362f), Integer.valueOf(i9));
            this.f49361e = true;
        }
    }

    public final void i(int i9, boolean z10) {
        this.f49362f = i9;
        if (z10) {
            this.f49358a.edit().putInt("brush", i9).apply();
        }
        Integer num = (Integer) this.f49360c.get(Integer.valueOf(i9));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f49364i = f10;
        this.f49358a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f49358a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
