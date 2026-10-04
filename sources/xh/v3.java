package xh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ui1;
import yh.l5;
public final class v3 implements l5 {
    public final int f50272a;
    public final long f50273b;
    public final Utilities.Callback f50274c;
    public int f50275e;
    public long f50278i;
    public String f50286q;
    public boolean f50287r;
    public boolean f50288s;
    public boolean f50289t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f50276f = new ArrayList();
    public final ArrayList f50277g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f50279j = new HashSet();
    public final HashSet f50280k = new HashSet();
    public final HashSet f50281l = new HashSet();
    public final HashMap f50282m = new HashMap();
    public final HashMap f50283n = new HashMap();
    public final HashMap f50284o = new HashMap();
    public u3 f50285p = u3.BY_PRICE;
    public boolean f50290u = false;
    public int v = -1;

    public v3(long j3, int i10, Utilities.Callback callback) {
        this.f50272a = i10;
        this.f50273b = j3;
        this.f50274c = callback;
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
        return this.f50275e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f50272a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f50289t = false;
    }

    public final void g(boolean z10) {
        if (!this.f50289t) {
            if (z10 || !this.f50290u) {
                this.f50289t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f50273b;
                String str = this.f50286q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f50288s;
                getresalestargifts.stars_only = this.f50287r;
                u3 u3Var = this.f50285p;
                int i10 = 0;
                if (u3Var == u3.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (u3Var == u3.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (u3Var == u3.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f50278i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f50277g;
                ArrayList arrayList3 = this.f50276f;
                if (j3 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f50279j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f50281l;
                HashSet hashSet3 = this.f50280k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f20043id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f20043id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f20043id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f20043id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f50272a).sendRequest(getresalestargifts, new ui1(5, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f50286q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f50274c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(u3 u3Var) {
        if (this.f50285p != u3Var) {
            this.f50285p = u3Var;
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
