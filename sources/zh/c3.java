package zh;

import bi.w9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.p41;
public final class c3 implements w9 {
    public final int f60263a;
    public final long f60264b;
    public final c20 f60265c;
    public int f60266e;
    public long f60269i;
    public String f60277q;
    public boolean f60278r;
    public boolean f60279s;
    public boolean f60280t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f60267f = new ArrayList();
    public final ArrayList f60268g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f60270j = new HashSet();
    public final HashSet f60271k = new HashSet();
    public final HashSet f60272l = new HashSet();
    public final HashMap f60273m = new HashMap();
    public final HashMap f60274n = new HashMap();
    public final HashMap f60275o = new HashMap();
    public b3 f60276p = b3.f60227a;
    public boolean f60281u = false;
    public int v = -1;

    public c3(int i7, long j3, c20 c20Var) {
        this.f60263a = i7;
        this.f60264b = j3;
        this.f60265c = c20Var;
    }

    @Override
    public final void a() {
        g(false);
    }

    @Override
    public final int b(int i7) {
        return -1;
    }

    @Override
    public final int c() {
        return this.f60266e;
    }

    @Override
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f60263a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f60280t = false;
    }

    public final void g(boolean z9) {
        if (!this.f60280t) {
            if (z9 || !this.f60281u) {
                this.f60280t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f60264b;
                String str = this.f60277q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f60279s;
                getresalestargifts.stars_only = this.f60278r;
                b3 b3Var = this.f60276p;
                int i7 = 0;
                if (b3Var == b3.f60229c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (b3Var == b3.f60228b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (b3Var == b3.f60227a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j3 = this.f60269i;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f60268g;
                ArrayList arrayList3 = this.f60267f;
                if (i10 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j3;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f60270j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f60272l;
                HashSet hashSet3 = this.f60271k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f26966id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f26966id;
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
                        while (i7 < size3) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f26966id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f26966id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f60263a).sendRequest(getresalestargifts, new p41(11, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final void h() {
        f();
        this.f60277q = null;
        this.d.clear();
        g(true);
        c20 c20Var = this.f60265c;
        if (c20Var != null) {
            c20Var.a(Boolean.TRUE);
        }
    }

    public final void i(b3 b3Var) {
        if (this.f60276p != b3Var) {
            this.f60276p = b3Var;
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
