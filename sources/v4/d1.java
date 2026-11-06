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
    public static final List f56926u = Collections.EMPTY_LIST;
    public final View f56927a;
    public WeakReference f56928b;
    public int f56936l;
    public RecyclerView f56944t;
    public int f56929c = -1;
    public int d = -1;
    public long f56930e = -1;
    public int f56931f = -1;
    public int f56932g = -1;
    public int h = -1;
    public int f56933i = -1;
    public d1 f56934j = null;
    public d1 f56935k = null;
    public ArrayList f56937m = null;
    public List f56938n = null;
    public int f56939o = 0;
    public v0 f56940p = null;
    public boolean f56941q = false;
    public int f56942r = 0;
    public int f56943s = -1;

    public d1(View view) {
        if (view != null) {
            this.f56927a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i7) {
        this.f56936l = i7 | this.f56936l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f56944t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.f56932g;
        if (i7 == -1) {
            return this.f56929c;
        }
        return i7;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f56936l & 1024) == 0 && (arrayList = this.f56937m) != null && arrayList.size() != 0) {
            return this.f56938n;
        }
        return f56926u;
    }

    public final boolean e(int i7) {
        if ((i7 & this.f56936l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f56927a;
        if (view.getParent() != null && view.getParent() != this.f56944t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f56936l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f56936l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f56936l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f54073a;
            if (!this.f56927a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f56936l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f56940p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f56936l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f56936l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i7, boolean z9) {
        if (this.d == -1) {
            this.d = this.f56929c;
        }
        if (this.f56932g == -1) {
            this.f56932g = this.f56929c;
        }
        if (z9) {
            this.f56932g += i7;
        }
        this.f56929c += i7;
        View view = this.f56927a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f57029c = true;
        }
    }

    public final void o() {
        this.f56936l = 0;
        int i7 = this.f56929c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.f56929c = -1;
        this.d = -1;
        this.f56930e = -1L;
        this.f56932g = -1;
        this.f56939o = 0;
        this.f56934j = null;
        this.f56935k = null;
        ArrayList arrayList = this.f56937m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f56936l &= -1025;
        this.f56942r = 0;
        this.f56943s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.f56936l = (i7 & i10) | (this.f56936l & (~i10));
    }

    public final void q(boolean z9) {
        int i7;
        int i10 = this.f56939o;
        if (z9) {
            i7 = i10 - 1;
        } else {
            i7 = i10 + 1;
        }
        this.f56939o = i7;
        if (i7 >= 0) {
            if (!z9 && i7 == 1) {
                this.f56936l |= 16;
                return;
            } else if (z9 && i7 == 0) {
                this.f56936l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f56939o = 0;
        boolean z10 = r2.f25191a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f56936l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f56936l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f56929c + " id=" + this.f56930e + ", oldPos=" + this.d + ", pLpos:" + this.f56932g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f56941q) {
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
        if ((this.f56936l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f56939o + ")");
        }
        if ((this.f56936l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f56927a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
