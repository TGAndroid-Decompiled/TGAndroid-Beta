package xh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.fj1;
import yh.g5;
public final class u3 implements g5 {
    public final int f51772a;
    public final long f51773b;
    public final Utilities.Callback f51774c;
    public int f51775e;
    public long f51778i;
    public String f51786q;
    public boolean f51787r;
    public boolean f51788s;
    public boolean f51789t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f51776f = new ArrayList();
    public final ArrayList f51777g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f51779j = new HashSet();
    public final HashSet f51780k = new HashSet();
    public final HashSet f51781l = new HashSet();
    public final HashMap f51782m = new HashMap();
    public final HashMap f51783n = new HashMap();
    public final HashMap f51784o = new HashMap();
    public t3 f51785p = t3.BY_PRICE;
    public boolean f51790u = false;
    public int v = -1;

    public u3(long j3, int i10, Utilities.Callback callback) {
        this.f51772a = i10;
        this.f51773b = j3;
        this.f51774c = callback;
    }

    @Override
    public final void a() {
        g(false);
    }

    @Override
    public final int b(int i10) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f51775e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f51772a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f51789t = false;
    }

    public final void g(boolean z10) {
        if (!this.f51789t) {
            if (z10 || !this.f51790u) {
                this.f51789t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f51773b;
                String str = this.f51786q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f51788s;
                getresalestargifts.stars_only = this.f51787r;
                t3 t3Var = this.f51785p;
                int i10 = 0;
                if (t3Var == t3.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (t3Var == t3.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (t3Var == t3.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f51778i;
                int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f51777g;
                ArrayList arrayList3 = this.f51776f;
                if (i11 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f51779j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f51781l;
                HashSet hashSet3 = this.f51780k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f19809id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f19809id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                            if (!hashSet3.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                                TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                                stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                                getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                            }
                        }
                    }
                    if (!hashSet2.isEmpty()) {
                        int size3 = arrayList.size();
                        while (i10 < size3) {
                            Object obj3 = arrayList.get(i10);
                            i10++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f19809id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f19809id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f51772a).sendRequest(getresalestargifts, new fj1(5, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f51786q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f51774c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(t3 t3Var) {
        if (this.f51785p != t3Var) {
            this.f51785p = t3Var;
            h();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override
    public final void d() {
    }
}
