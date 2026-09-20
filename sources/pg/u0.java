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
    public static final List f41297m;
    public static final List f41298n;
    public static final int f41299o;
    public static final int f41300p;
    public static final int f41301q;
    public static final u0[] f41302r;
    public final SharedPreferences f41303a;
    public final ArrayList f41304b;
    public final HashMap f41305c;
    public List d;
    public boolean e;
    public int f41306f;
    public int f41307g;
    public int h;
    public float f41308i;
    public String f41309j;
    public boolean f41310k;
    public boolean f41311l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f41297m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f41298n = asList2;
        int size = asList.size();
        f41299o = size;
        int size2 = asList2.size();
        f41300p = size2;
        f41301q = size + size2;
        f41302r = new u0[4];
    }

    public u0(int i10) {
        List list;
        int i11 = f41301q;
        this.f41304b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f41199a.size());
        this.f41305c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f41303a = sharedPreferences;
        this.f41306f = sharedPreferences.getInt("brush", 0);
        this.f41308i = sharedPreferences.getFloat("weight", 0.5f);
        this.f41309j = sharedPreferences.getString("typeface", "roboto");
        this.f41307g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f41310k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f41299o) {
            i13 = e2.e((int) sharedPreferences.getLong(hg.k0.h(i13, "color_"), ((Integer) f41297m.get(i13)).intValue()), i13, 1, this.f41304b);
        }
        while (true) {
            if (i12 < m.f41199a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(hg.k0.h(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static u0 e(int i10) {
        u0[] u0VarArr = f41302r;
        if (u0VarArr[i10] == null) {
            u0VarArr[i10] = new u0(i10);
        }
        return u0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f41297m);
        SharedPreferences.Editor edit = this.f41303a.edit();
        for (int i10 = 0; i10 < m.f41199a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f41305c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f41301q;
        if (i10 >= 0 && i10 < i11) {
            List list = f41298n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f41304b);
            if (i10 >= arrayList.size()) {
                int i12 = f41300p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f41297m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(hg.k0.h(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f41306f);
        HashMap hashMap = this.f41305c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f41306f;
            int i10 = this.f41306f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f41199a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f41303a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f41306f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f41298n);
        arrayList.addAll(this.f41304b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f41303a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f41303a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f41299o; i10++) {
                String h = hg.k0.h(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f41297m;
                }
                edit.putLong(h, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f41304b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            Integer num = (Integer) this.f41305c.get(Integer.valueOf(this.f41306f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f41306f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f41298n);
        Collection collection = this.f41304b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f41305c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f41306f), Integer.valueOf(b(indexOf)));
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
        List list = f41297m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f41306f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f41306f = i10;
        if (z10) {
            this.f41303a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f41305c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f41308i = f7;
        this.f41303a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f41303a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
