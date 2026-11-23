package v4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
public abstract class e1 {
    public static final List f59110u = Collections.EMPTY_LIST;
    public final View f59111a;
    public WeakReference f59112b;
    public int f59120l;
    public RecyclerView f59128t;
    public int f59113c = -1;
    public int d = -1;
    public long f59114e = -1;
    public int f59115f = -1;
    public int f59116g = -1;
    public int h = -1;
    public int f59117i = -1;
    public e1 f59118j = null;
    public e1 f59119k = null;
    public ArrayList f59121m = null;
    public List f59122n = null;
    public int f59123o = 0;
    public w0 f59124p = null;
    public boolean f59125q = false;
    public int f59126r = 0;
    public int f59127s = -1;

    public e1(View view) {
        if (view != null) {
            this.f59111a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f59120l = i7 | this.f59120l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f59128t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f59116g;
        if (i7 == -1) {
            return this.f59113c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f59120l & 1024) == 0 && (arrayList = this.f59121m) != null && arrayList.size() != 0) {
            return this.f59122n;
        }
        return f59110u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f59120l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f59111a;
        if (view.getParent() != null && view.getParent() != this.f59128t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f59120l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f59120l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f59120l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f56254a;
            if (!this.f59111a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f59120l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f59124p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f59120l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f59120l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z10) {
        if (this.d == -1) {
            this.d = this.f59113c;
        }
        if (this.f59116g == -1) {
            this.f59116g = this.f59113c;
        }
        if (z10) {
            this.f59116g += i7;
        }
        this.f59113c += i7;
        View view = this.f59111a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f59214c = true;
        }
    }

    public final void o() {
        this.f59120l = 0;
        int i7 = this.f59113c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f59113c = -1;
        this.d = -1;
        this.f59114e = -1L;
        this.f59116g = -1;
        this.f59123o = 0;
        this.f59118j = null;
        this.f59119k = null;
        ArrayList arrayList = this.f59121m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f59120l &= -1025;
        this.f59126r = 0;
        this.f59127s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f59120l = (i7 & i10) | (this.f59120l & (~i10));
    }

    public final void q(boolean z10) {
        int i7;
        int i10 = this.f59123o;
        if (z10) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f59123o = i7;
        if (i7 >= 0) {
            if (!z10 && i7 == 1) {
                this.f59120l |= 16;
                return;
            } else if (z10 && i7 == 0) {
                this.f59120l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f59123o = 0;
        boolean z11 = s2.f26694a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f59120l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f59120l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f59113c + " id=" + this.f59114e + ", oldPos=" + this.d + ", pLpos:" + this.f59116g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f59125q) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (h()) {
            sb2.append(" invalid");
        }
        if (!g()) {
            sb2.append(" unbound");
        }
        if ((this.f59120l & 2) != 0) {
            sb2.append(" update");
        }
        if (j()) {
            sb2.append(" removed");
        }
        if (r()) {
            sb2.append(" ignored");
        }
        if (l()) {
            sb2.append(" tmpDetached");
        }
        if (!i()) {
            sb2.append(" not recyclable(" + this.f59123o + ")");
        }
        if ((this.f59120l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f59111a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
