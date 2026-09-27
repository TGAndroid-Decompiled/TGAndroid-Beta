package xh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.si1;
import yh.l5;
public final class w3 implements l5 {
    public final int f46525a;
    public final long f46526b;
    public final Utilities.Callback f46527c;
    public int e;
    public long f46530i;
    public String f46538q;
    public boolean f46539r;
    public boolean f46540s;
    public boolean f46541t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f46528f = new ArrayList();
    public final ArrayList f46529g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f46531j = new HashSet();
    public final HashSet f46532k = new HashSet();
    public final HashSet f46533l = new HashSet();
    public final HashMap f46534m = new HashMap();
    public final HashMap f46535n = new HashMap();
    public final HashMap f46536o = new HashMap();
    public v3 f46537p = v3.BY_PRICE;
    public boolean f46542u = false;
    public int v = -1;

    public w3(long j3, int i10, Utilities.Callback callback) {
        this.f46525a = i10;
        this.f46526b = j3;
        this.f46527c = callback;
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
        return this.e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f46525a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f46541t = false;
    }

    public final void g(boolean z10) {
        if (!this.f46541t) {
            if (z10 || !this.f46542u) {
                this.f46541t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f46526b;
                String str = this.f46538q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f46540s;
                getresalestargifts.stars_only = this.f46539r;
                v3 v3Var = this.f46537p;
                int i10 = 0;
                if (v3Var == v3.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (v3Var == v3.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (v3Var == v3.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f46530i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f46529g;
                ArrayList arrayList3 = this.f46528f;
                if (j3 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f46531j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f46533l;
                HashSet hashSet3 = this.f46532k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f18335id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f18335id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f18335id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f18335id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f46525a).sendRequest(getresalestargifts, new si1(5, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f46538q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f46527c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(v3 v3Var) {
        if (this.f46537p != v3Var) {
            this.f46537p = v3Var;
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
