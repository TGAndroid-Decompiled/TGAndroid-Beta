package yf;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;

public final class r0 {

    public static final List f50048m;

    public static final List f50049n;

    public static final int f50050o;

    public static final int f50051p;

    public static final int f50052q;

    public static final r0[] f50053r;

    public final SharedPreferences f50054a;

    public final ArrayList f50055b;

    public final HashMap f50056c;
    public List d;

    public boolean f50057e;

    public int f50058f;

    public int f50059g;
    public int h;

    public float f50060i;

    public String f50061j;

    public boolean f50062k;

    public boolean f50063l;

    static {
        List listAsList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f50048m = listAsList;
        List listAsList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f50049n = listAsList2;
        int size = listAsList.size();
        f50050o = size;
        int size2 = listAsList2.size();
        f50051p = size2;
        f50052q = size + size2;
        f50053r = new r0[4];
    }

    public r0(int i10) {
        int i11 = f50052q;
        this.f50055b = new ArrayList(i11);
        HashMap map = new HashMap(m.f49979a.size());
        this.f50056c = map;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f50054a = sharedPreferences;
        this.f50058f = sharedPreferences.getInt("brush", 0);
        this.f50060i = sharedPreferences.getFloat("weight", 0.5f);
        this.f50061j = sharedPreferences.getString("typeface", "roboto");
        this.f50059g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f50062k = sharedPreferences.getBoolean("fill_shapes", false);
        int iF = 0;
        while (iF < f50050o) {
            iF = i0.a.f((int) sharedPreferences.getLong(i0.a.k(iF, "color_"), ((Integer) f50048m.get(iF)).intValue()), iF, 1, this.f50055b);
        }
        while (true) {
            List list = m.f49979a;
            if (i12 >= list.size()) {
                map.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            } else {
                map.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(i0.a.k(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            }
        }
    }

    public static r0 e(int i10) {
        r0[] r0VarArr = f50053r;
        if (r0VarArr[i10] == null) {
            r0VarArr[i10] = new r0(i10);
        }
        return r0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f50048m);
        SharedPreferences.Editor editorEdit = this.f50054a.edit();
        for (int i10 = 0; i10 < m.f49979a.size(); i10++) {
            editorEdit.remove("brush_color_" + i10);
        }
        editorEdit.remove("brush_color_-1");
        this.f50056c.clear();
        editorEdit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f50052q;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(i0.a.k(i11, "Color palette index should be in range 0 ... "));
        }
        List list = f50049n;
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(this.f50055b);
        if (i10 < arrayList.size()) {
            return ((Integer) arrayList.get(i10)).intValue();
        }
        int i12 = f50051p;
        return i10 < i12 ? ((Integer) list.get(i10)).intValue() : ((Integer) f50048m.get(i10 - i12)).intValue();
    }

    public final int c() {
        Integer numValueOf = Integer.valueOf(this.f50058f);
        HashMap map = this.f50056c;
        Integer numValueOf2 = (Integer) map.get(numValueOf);
        if (numValueOf2 == null) {
            String str = "brush_color_" + this.f50058f;
            int i10 = this.f50058f;
            numValueOf2 = Integer.valueOf((int) this.f50054a.getLong(str, i10 == -1 ? -1L : ((m) m.f49979a.get(i10)).c()));
            map.put(Integer.valueOf(this.f50058f), numValueOf2);
        }
        return numValueOf2.intValue();
    }

    public final int d() {
        int iC = c();
        ArrayList arrayList = new ArrayList(f50049n);
        arrayList.addAll(this.f50055b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == iC) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f50054a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        if (!this.d.isEmpty() || this.f50057e) {
            SharedPreferences.Editor editorEdit = this.f50054a.edit();
            if (!this.d.isEmpty()) {
                int i10 = 0;
                while (i10 < f50050o) {
                    editorEdit.putLong(i0.a.k(i10, "color_"), ((Integer) (i10 < this.d.size() ? this.d : f50048m).get(i10)).intValue());
                    i10++;
                }
                ArrayList arrayList = this.f50055b;
                arrayList.clear();
                arrayList.addAll(this.d);
                this.d.clear();
            }
            if (this.f50057e) {
                Integer num = (Integer) this.f50056c.get(Integer.valueOf(this.f50058f));
                if (num != null) {
                    editorEdit.putLong("brush_color_" + this.f50058f, num.intValue());
                }
                this.f50057e = false;
            }
            editorEdit.apply();
        }
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f50049n);
        Collection collection = this.f50055b;
        arrayList.addAll(collection);
        int iIndexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap map = this.f50056c;
        if (iIndexOf != -1) {
            if (z10) {
                map.put(Integer.valueOf(this.f50058f), Integer.valueOf(b(iIndexOf)));
                this.f50057e = true;
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
        List list = f50048m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            map.put(Integer.valueOf(this.f50058f), Integer.valueOf(i10));
            this.f50057e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f50058f = i10;
        if (z10) {
            this.f50054a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f50056c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f50060i = f10;
        this.f50054a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        this.f50054a.edit().putFloat("weight_" + str, f10).apply();
    }
}
