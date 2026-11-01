package ph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sl0;
import rh.w5;
public final class h3 implements w5 {
    public final int f45100a;
    public final long f45101b;
    public final r20 f45102c;
    public int e;
    public long f45105i;
    public String f45113q;
    public boolean f45114r;
    public boolean f45115s;
    public boolean f45116t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f45103f = new ArrayList();
    public final ArrayList f45104g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f45106j = new HashSet();
    public final HashSet f45107k = new HashSet();
    public final HashSet f45108l = new HashSet();
    public final HashMap f45109m = new HashMap();
    public final HashMap f45110n = new HashMap();
    public final HashMap f45111o = new HashMap();
    public g3 f45112p = g3.f45078a;
    public boolean f45117u = false;
    public int v = -1;

    public h3(int i10, long j10, r20 r20Var) {
        this.f45100a = i10;
        this.f45101b = j10;
        this.f45102c = r20Var;
    }

    @Override
    public final int a(int i10) {
        return -1;
    }

    @Override
    public final void b() {
        g(false);
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
            ConnectionsManager.getInstance(this.f45100a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f45116t = false;
    }

    public final void g(boolean z10) {
        if (!this.f45116t) {
            if (z10 || !this.f45117u) {
                this.f45116t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f45101b;
                String str = this.f45113q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f45115s;
                getresalestargifts.stars_only = this.f45114r;
                g3 g3Var = this.f45112p;
                int i10 = 0;
                if (g3Var == g3.f45080c) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (g3Var == g3.f45079b) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (g3Var == g3.f45078a) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j10 = this.f45105i;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f45104g;
                ArrayList arrayList3 = this.f45103f;
                if (i11 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f45106j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f45108l;
                HashSet hashSet3 = this.f45107k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f19800id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f19800id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f19800id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f19800id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f45100a).sendRequest(getresalestargifts, new sl0(22, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.f45113q = null;
        this.d.clear();
        g(true);
        r20 r20Var = this.f45102c;
        if (r20Var != null) {
            r20Var.a(Boolean.TRUE);
        }
    }

    public final void i(g3 g3Var) {
        if (this.f45112p != g3Var) {
            this.f45112p = g3Var;
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
