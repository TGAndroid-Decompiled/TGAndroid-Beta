package yh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.kj1;
import zh.g5;
public final class t3 implements g5 {
    public final int f49128a;
    public final long f49129b;
    public final Utilities.Callback f49130c;
    public int e;
    public long f49133i;
    public String f49141q;
    public boolean f49142r;
    public boolean f49143s;
    public boolean f49144t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f49131f = new ArrayList();
    public final ArrayList f49132g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f49134j = new HashSet();
    public final HashSet f49135k = new HashSet();
    public final HashSet f49136l = new HashSet();
    public final HashMap f49137m = new HashMap();
    public final HashMap f49138n = new HashMap();
    public final HashMap f49139o = new HashMap();
    public s3 f49140p = s3.BY_PRICE;
    public boolean f49145u = false;
    public int v = -1;

    public t3(long j10, int i10, Utilities.Callback callback) {
        this.f49128a = i10;
        this.f49129b = j10;
        this.f49130c = callback;
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
            ConnectionsManager.getInstance(this.f49128a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f49144t = false;
    }

    public final void g(boolean z10) {
        if (!this.f49144t) {
            if (z10 || !this.f49145u) {
                this.f49144t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f49129b;
                String str = this.f49141q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f49143s;
                getresalestargifts.stars_only = this.f49142r;
                s3 s3Var = this.f49140p;
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
                long j10 = this.f49133i;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f49132g;
                ArrayList arrayList3 = this.f49131f;
                if (i11 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f49134j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f49136l;
                HashSet hashSet3 = this.f49135k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f18922id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f18922id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f18922id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f18922id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f49128a).sendRequest(getresalestargifts, new kj1(5, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f49141q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f49130c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(s3 s3Var) {
        if (this.f49140p != s3Var) {
            this.f49140p = s3Var;
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
