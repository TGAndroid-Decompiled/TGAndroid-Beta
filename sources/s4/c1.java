package s4;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
public abstract class c1 {
    public static final List f46523u = Collections.EMPTY_LIST;
    public final View f46524a;
    public WeakReference f46525b;
    public int f46533l;
    public RecyclerView f46541t;
    public int f46526c = -1;
    public int d = -1;
    public long f46527e = -1;
    public int f46528f = -1;
    public int f46529g = -1;
    public int h = -1;
    public int f46530i = -1;
    public c1 f46531j = null;
    public c1 f46532k = null;
    public ArrayList f46534m = null;
    public List f46535n = null;
    public int f46536o = 0;
    public of.e f46537p = null;
    public boolean f46538q = false;
    public int f46539r = 0;
    public int f46540s = -1;

    public c1(View view) {
        if (view != null) {
            this.f46524a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f46533l = i10 | this.f46533l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f46541t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f46529g;
        if (i10 == -1) {
            return this.f46526c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f46533l & 1024) == 0 && (arrayList = this.f46534m) != null && arrayList.size() != 0) {
            return this.f46535n;
        }
        return f46523u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f46533l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f46524a;
        if (view.getParent() != null && view.getParent() != this.f46541t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f46533l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f46533l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f46533l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f45596a;
            if (!this.f46524a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f46533l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f46537p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f46533l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f46533l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f46526c;
        }
        if (this.f46529g == -1) {
            this.f46529g = this.f46526c;
        }
        if (z10) {
            this.f46529g += i10;
        }
        this.f46526c += i10;
        View view = this.f46524a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f46645c = true;
        }
    }

    public final void o() {
        this.f46533l = 0;
        int i10 = this.f46526c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f46526c = -1;
        this.d = -1;
        this.f46527e = -1L;
        this.f46529g = -1;
        this.f46536o = 0;
        this.f46531j = null;
        this.f46532k = null;
        ArrayList arrayList = this.f46534m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f46533l &= -1025;
        this.f46539r = 0;
        this.f46540s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f46533l = (i10 & i11) | (this.f46533l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f46536o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f46536o = i10;
        if (i10 < 0) {
            this.f46536o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f46533l |= 16;
        } else if (z10 && i10 == 0) {
            this.f46533l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f46533l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f46533l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f46526c + " id=" + this.f46527e + ", oldPos=" + this.d + ", pLpos:" + this.f46529g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f46538q) {
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
        if ((this.f46533l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f46536o + ")");
        }
        if ((this.f46533l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f46524a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
