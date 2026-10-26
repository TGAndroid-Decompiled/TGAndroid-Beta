package zh;

import bi.u9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.l71;
public final class u3 implements u9 {
    public final int f53265a;
    public final long f53266b;
    public final Utilities.Callback f53267c;
    public int e;
    public long f53270i;
    public String f53278q;
    public boolean f53279r;
    public boolean f53280s;
    public boolean f53281t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f53268f = new ArrayList();
    public final ArrayList f53269g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f53271j = new HashSet();
    public final HashSet f53272k = new HashSet();
    public final HashSet f53273l = new HashSet();
    public final HashMap f53274m = new HashMap();
    public final HashMap f53275n = new HashMap();
    public final HashMap f53276o = new HashMap();
    public t3 f53277p = t3.BY_PRICE;
    public boolean f53282u = false;
    public int v = -1;

    public u3(long j10, int i10, Utilities.Callback callback) {
        this.f53265a = i10;
        this.f53266b = j10;
        this.f53267c = callback;
    }

    public final void a() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.f53265a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.f53281t = false;
    }

    @Override
    public final void b() {
        g(false);
    }

    @Override
    public final int c(int i10) {
        return -1;
    }

    @Override
    public final int d() {
        return this.e;
    }

    @Override
    public final int f() {
        return this.d.size();
    }

    public final void g(boolean z10) {
        if (!this.f53281t) {
            if (z10 || !this.f53282u) {
                this.f53281t = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.f53266b;
                String str = this.f53278q;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.f53280s;
                getresalestargifts.stars_only = this.f53279r;
                t3 t3Var = this.f53277p;
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
                long j10 = this.f53270i;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                ArrayList arrayList = this.h;
                ArrayList arrayList2 = this.f53269g;
                ArrayList arrayList3 = this.f53268f;
                if (i11 != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j10;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.f53271j;
                boolean isEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.f53273l;
                HashSet hashSet3 = this.f53272k;
                if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.f22033id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.f22033id;
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
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.f22033id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.f22033id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.v = ConnectionsManager.getInstance(this.f53265a).sendRequest(getresalestargifts, new l71(14, this, getresalestargifts));
            }
        }
    }

    @Override
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        a();
        this.f53278q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.f53267c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(t3 t3Var) {
        if (this.f53277p != t3Var) {
            this.f53277p = t3Var;
            h();
        }
    }

    @Override
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override
    public final void e() {
    }
}
