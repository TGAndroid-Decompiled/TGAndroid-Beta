package v4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
public abstract class f1 {
    public static final List f59164u = Collections.EMPTY_LIST;
    public final View f59165a;
    public WeakReference f59166b;
    public int f59174l;
    public RecyclerView f59182t;
    public int f59167c = -1;
    public int d = -1;
    public long f59168e = -1;
    public int f59169f = -1;
    public int f59170g = -1;
    public int h = -1;
    public int f59171i = -1;
    public f1 f59172j = null;
    public f1 f59173k = null;
    public ArrayList f59175m = null;
    public List f59176n = null;
    public int f59177o = 0;
    public x0 f59178p = null;
    public boolean f59179q = false;
    public int f59180r = 0;
    public int f59181s = -1;

    public f1(View view) {
        if (view != null) {
            this.f59165a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f59174l = i7 | this.f59174l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f59182t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f59170g;
        if (i7 == -1) {
            return this.f59167c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f59174l & 1024) == 0 && (arrayList = this.f59175m) != null && arrayList.size() != 0) {
            return this.f59176n;
        }
        return f59164u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f59174l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f59165a;
        if (view.getParent() != null && view.getParent() != this.f59182t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f59174l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f59174l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f59174l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f56289a;
            if (!this.f59165a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f59174l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f59178p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f59174l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f59174l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z10) {
        if (this.d == -1) {
            this.d = this.f59167c;
        }
        if (this.f59170g == -1) {
            this.f59170g = this.f59167c;
        }
        if (z10) {
            this.f59170g += i7;
        }
        this.f59167c += i7;
        View view = this.f59165a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f59267c = true;
        }
    }

    public final void o() {
        this.f59174l = 0;
        int i7 = this.f59167c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f59167c = -1;
        this.d = -1;
        this.f59168e = -1L;
        this.f59170g = -1;
        this.f59177o = 0;
        this.f59172j = null;
        this.f59173k = null;
        ArrayList arrayList = this.f59175m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f59174l &= -1025;
        this.f59180r = 0;
        this.f59181s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f59174l = (i7 & i10) | (this.f59174l & (~i10));
    }

    public final void q(boolean z10) {
        int i7;
        int i10 = this.f59177o;
        if (z10) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f59177o = i7;
        if (i7 >= 0) {
            if (!z10 && i7 == 1) {
                this.f59174l |= 16;
                return;
            } else if (z10 && i7 == 0) {
                this.f59174l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f59177o = 0;
        boolean z11 = s2.f26730a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f59174l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f59174l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f59167c + " id=" + this.f59168e + ", oldPos=" + this.d + ", pLpos:" + this.f59170g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f59179q) {
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
        if ((this.f59174l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f59177o + ")");
        }
        if ((this.f59174l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f59165a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
