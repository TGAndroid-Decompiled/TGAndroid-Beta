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
    public static final List f56951u = Collections.EMPTY_LIST;
    public final View f56952a;
    public WeakReference f56953b;
    public int f56961l;
    public RecyclerView f56969t;
    public int f56954c = -1;
    public int d = -1;
    public long f56955e = -1;
    public int f56956f = -1;
    public int f56957g = -1;
    public int h = -1;
    public int f56958i = -1;
    public d1 f56959j = null;
    public d1 f56960k = null;
    public ArrayList f56962m = null;
    public List f56963n = null;
    public int f56964o = 0;
    public v0 f56965p = null;
    public boolean f56966q = false;
    public int f56967r = 0;
    public int f56968s = -1;

    public d1(View view) {
        if (view != null) {
            this.f56952a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f56961l = i7 | this.f56961l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f56969t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f56957g;
        if (i7 == -1) {
            return this.f56954c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f56961l & 1024) == 0 && (arrayList = this.f56962m) != null && arrayList.size() != 0) {
            return this.f56963n;
        }
        return f56951u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f56961l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f56952a;
        if (view.getParent() != null && view.getParent() != this.f56969t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f56961l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f56961l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f56961l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f54098a;
            if (!this.f56952a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f56961l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f56965p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f56961l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f56961l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z9) {
        if (this.d == -1) {
            this.d = this.f56954c;
        }
        if (this.f56957g == -1) {
            this.f56957g = this.f56954c;
        }
        if (z9) {
            this.f56957g += i7;
        }
        this.f56954c += i7;
        View view = this.f56952a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f57054c = true;
        }
    }

    public final void o() {
        this.f56961l = 0;
        int i7 = this.f56954c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f56954c = -1;
        this.d = -1;
        this.f56955e = -1L;
        this.f56957g = -1;
        this.f56964o = 0;
        this.f56959j = null;
        this.f56960k = null;
        ArrayList arrayList = this.f56962m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f56961l &= -1025;
        this.f56967r = 0;
        this.f56968s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f56961l = (i7 & i10) | (this.f56961l & (~i10));
    }

    public final void q(boolean z9) {
        int i7;
        int i10 = this.f56964o;
        if (z9) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f56964o = i7;
        if (i7 >= 0) {
            if (!z9 && i7 == 1) {
                this.f56961l |= 16;
                return;
            } else if (z9 && i7 == 0) {
                this.f56961l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f56964o = 0;
        boolean z10 = r2.f25191a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f56961l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f56961l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f56954c + " id=" + this.f56955e + ", oldPos=" + this.d + ", pLpos:" + this.f56957g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f56966q) {
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
        if ((this.f56961l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f56964o + ")");
        }
        if ((this.f56961l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f56952a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
