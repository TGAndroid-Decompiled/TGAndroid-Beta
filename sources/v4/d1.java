package v4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
public abstract class d1 {
    public static final List f57042u = Collections.EMPTY_LIST;
    public final View f57043a;
    public WeakReference f57044b;
    public int f57052l;
    public RecyclerView f57060t;
    public int f57045c = -1;
    public int d = -1;
    public long f57046e = -1;
    public int f57047f = -1;
    public int f57048g = -1;
    public int h = -1;
    public int f57049i = -1;
    public d1 f57050j = null;
    public d1 f57051k = null;
    public ArrayList f57053m = null;
    public List f57054n = null;
    public int f57055o = 0;
    public v0 f57056p = null;
    public boolean f57057q = false;
    public int f57058r = 0;
    public int f57059s = -1;

    public d1(View view) {
        if (view != null) {
            this.f57043a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f57052l = i7 | this.f57052l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f57060t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f57048g;
        if (i7 == -1) {
            return this.f57045c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f57052l & 1024) == 0 && (arrayList = this.f57053m) != null && arrayList.size() != 0) {
            return this.f57054n;
        }
        return f57042u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f57052l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f57043a;
        if (view.getParent() != null && view.getParent() != this.f57060t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f57052l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f57052l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f57052l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f54190a;
            if (!this.f57043a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f57052l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f57056p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f57052l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f57052l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z9) {
        if (this.d == -1) {
            this.d = this.f57045c;
        }
        if (this.f57048g == -1) {
            this.f57048g = this.f57045c;
        }
        if (z9) {
            this.f57048g += i7;
        }
        this.f57045c += i7;
        View view = this.f57043a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f57145c = true;
        }
    }

    public final void o() {
        this.f57052l = 0;
        int i7 = this.f57045c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f57045c = -1;
        this.d = -1;
        this.f57046e = -1L;
        this.f57048g = -1;
        this.f57055o = 0;
        this.f57050j = null;
        this.f57051k = null;
        ArrayList arrayList = this.f57053m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f57052l &= -1025;
        this.f57058r = 0;
        this.f57059s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f57052l = (i7 & i10) | (this.f57052l & (~i10));
    }

    public final void q(boolean z9) {
        int i7;
        int i10 = this.f57055o;
        if (z9) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f57055o = i7;
        if (i7 >= 0) {
            if (!z9 && i7 == 1) {
                this.f57052l |= 16;
                return;
            } else if (z9 && i7 == 0) {
                this.f57052l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f57055o = 0;
        boolean z10 = r2.f25212a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f57052l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f57052l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f57045c + " id=" + this.f57046e + ", oldPos=" + this.d + ", pLpos:" + this.f57048g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f57057q) {
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
        if ((this.f57052l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f57055o + ")");
        }
        if ((this.f57052l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f57043a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
