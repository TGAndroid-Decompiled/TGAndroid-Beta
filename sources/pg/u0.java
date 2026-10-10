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
    public static final List f45838m;
    public static final List f45839n;
    public static final int f45840o;
    public static final int f45841p;
    public static final int f45842q;
    public static final u0[] f45843r;
    public final SharedPreferences f45844a;
    public final ArrayList f45845b;
    public final HashMap f45846c;
    public List d;
    public boolean f45847e;
    public int f45848f;
    public int f45849g;
    public int h;
    public float f45850i;
    public String f45851j;
    public boolean f45852k;
    public boolean f45853l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f45838m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f45839n = asList2;
        int size = asList.size();
        f45840o = size;
        int size2 = asList2.size();
        f45841p = size2;
        f45842q = size + size2;
        f45843r = new u0[4];
    }

    public u0(int i10) {
        List list;
        int i11 = f45842q;
        this.f45845b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f45732a.size());
        this.f45846c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f45844a = sharedPreferences;
        this.f45848f = sharedPreferences.getInt("brush", 0);
        this.f45850i = sharedPreferences.getFloat("weight", 0.5f);
        this.f45851j = sharedPreferences.getString("typeface", "roboto");
        this.f45849g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f45852k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f45840o) {
            i13 = e2.e((int) sharedPreferences.getLong(hg.c.h(i13, "color_"), ((Integer) f45838m.get(i13)).intValue()), i13, 1, this.f45845b);
        }
        while (true) {
            if (i12 < m.f45732a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(hg.c.h(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static u0 e(int i10) {
        u0[] u0VarArr = f45843r;
        if (u0VarArr[i10] == null) {
            u0VarArr[i10] = new u0(i10);
        }
        return u0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f45838m);
        SharedPreferences.Editor edit = this.f45844a.edit();
        for (int i10 = 0; i10 < m.f45732a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f45846c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f45842q;
        if (i10 >= 0 && i10 < i11) {
            List list = f45839n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f45845b);
            if (i10 >= arrayList.size()) {
                int i12 = f45841p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f45838m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(hg.c.h(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f45848f);
        HashMap hashMap = this.f45846c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f45848f;
            int i10 = this.f45848f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f45732a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f45844a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f45848f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f45839n);
        arrayList.addAll(this.f45845b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f45844a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.f45847e) {
            return;
        }
        SharedPreferences.Editor edit = this.f45844a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f45840o; i10++) {
                String h = hg.c.h(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f45838m;
                }
                edit.putLong(h, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f45845b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f45847e) {
            if (((Integer) this.f45846c.get(Integer.valueOf(this.f45848f))) != null) {
                edit.putLong("brush_color_" + this.f45848f, num.intValue());
            }
            this.f45847e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f45839n);
        Collection collection = this.f45845b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f45846c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f45848f), Integer.valueOf(b(indexOf)));
                this.f45847e = true;
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
        List list = f45838m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f45848f), Integer.valueOf(i10));
            this.f45847e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f45848f = i10;
        if (z10) {
            this.f45844a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f45846c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f45850i = f7;
        this.f45844a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f45844a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
