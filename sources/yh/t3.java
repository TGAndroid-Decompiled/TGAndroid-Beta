package yh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cj1;
import zh.k5;
public final class t3 implements k5 {
    public final int f50585a;
    public final long f50586b;
    public final Utilities.Callback f50587c;
    public int f50588e;
    public long f50591i;
    public String f50599q;
    public boolean f50600r;
    public boolean f50601s;
    public boolean f50602t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f50589f = new ArrayList();
    public final ArrayList f50590g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f50592j = new HashSet();
    public final HashSet f50593k = new HashSet();
    public final HashSet f50594l = new HashSet();
    public final HashMap f50595m = new HashMap();
    public final HashMap f50596n = new HashMap();
    public final HashMap f50597o = new HashMap();
    public s3 f50598p = s3.BY_PRICE;
    public boolean f50603u = false;
    public int v = -1;

    public t3(long j3, int i10, Utilities.Callback callback) {
        this.f50585a = i10;
        this.f50586b = j3;
        this.f50587c = callback;
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
        return this.f50588e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f50585a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f50602t = false;
    }

    public final void g(boolean z10) {
        if (!this.f50602t) {
            if (z10 || !this.f50603u) {
                this.f50602t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f50586b;
                String str = this.f50599q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f50601s;
                getresalestargifts.stars_only = this.f50600r;
                s3 s3Var = this.f50598p;
                int i10 = 0;
                if (s3Var == s3.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (s3Var == s3.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (s3Var == s3.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f50591i;
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f50590g;
                ArrayList arrayList3 = this.f50589f;
                if (j3 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f50592j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f50594l;
                HashSet hashSet3 = this.f50593k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f19902id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f19902id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f19902id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f19902id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f50585a).sendRequest(getresalestargifts, new cj1(5, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f50599q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f50587c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(s3 s3Var) {
        if (this.f50598p != s3Var) {
            this.f50598p = s3Var;
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
