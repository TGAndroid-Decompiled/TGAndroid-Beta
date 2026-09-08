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
    public static final List f45765u = Collections.EMPTY_LIST;
    public final View f45766a;
    public WeakReference f45767b;
    public int f45775l;
    public RecyclerView f45783t;
    public int f45768c = -1;
    public int d = -1;
    public long f45769e = -1;
    public int f45770f = -1;
    public int f45771g = -1;
    public int h = -1;
    public int f45772i = -1;
    public c1 f45773j = null;
    public c1 f45774k = null;
    public ArrayList f45776m = null;
    public List f45777n = null;
    public int f45778o = 0;
    public pf.e f45779p = null;
    public boolean f45780q = false;
    public int f45781r = 0;
    public int f45782s = -1;

    public c1(View view) {
        if (view != null) {
            this.f45766a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f45775l = i10 | this.f45775l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f45783t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f45771g;
        if (i10 == -1) {
            return this.f45768c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f45775l & 1024) == 0 && (arrayList = this.f45776m) != null && arrayList.size() != 0) {
            return this.f45777n;
        }
        return f45765u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f45775l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f45766a;
        if (view.getParent() != null && view.getParent() != this.f45783t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f45775l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f45775l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f45775l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f44725a;
            if (!this.f45766a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f45775l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f45779p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f45775l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f45775l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f45768c;
        }
        if (this.f45771g == -1) {
            this.f45771g = this.f45768c;
        }
        if (z10) {
            this.f45771g += i10;
        }
        this.f45768c += i10;
        View view = this.f45766a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f45887c = true;
        }
    }

    public final void o() {
        this.f45775l = 0;
        int i10 = this.f45768c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f45768c = -1;
        this.d = -1;
        this.f45769e = -1L;
        this.f45771g = -1;
        this.f45778o = 0;
        this.f45773j = null;
        this.f45774k = null;
        ArrayList arrayList = this.f45776m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f45775l &= -1025;
        this.f45781r = 0;
        this.f45782s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f45775l = (i10 & i11) | (this.f45775l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f45778o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f45778o = i10;
        if (i10 < 0) {
            this.f45778o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f45775l |= 16;
        } else if (z10 && i10 == 0) {
            this.f45775l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f45775l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f45775l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f45768c + " id=" + this.f45769e + ", oldPos=" + this.d + ", pLpos:" + this.f45771g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f45780q) {
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
        if ((this.f45775l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f45778o + ")");
        }
        if ((this.f45775l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f45766a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
