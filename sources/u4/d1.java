package u4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
public abstract class d1 {
    public static final List f55539u = Collections.EMPTY_LIST;
    public final View f55540a;
    public WeakReference f55541b;
    public int f55549l;
    public RecyclerView f55557t;
    public int f55542c = -1;
    public int d = -1;
    public long f55543e = -1;
    public int f55544f = -1;
    public int f55545g = -1;
    public int h = -1;
    public int f55546i = -1;
    public d1 f55547j = null;
    public d1 f55548k = null;
    public ArrayList f55550m = null;
    public List f55551n = null;
    public int f55552o = 0;
    public tf.e f55553p = null;
    public boolean f55554q = false;
    public int f55555r = 0;
    public int f55556s = -1;

    public d1(View view) {
        if (view != null) {
            this.f55540a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i3) {
        this.f55549l = i3 | this.f55549l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f55557t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i3 = this.f55545g;
        if (i3 == -1) {
            return this.f55542c;
        }
        return i3;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f55549l & 1024) == 0 && (arrayList = this.f55550m) != null && arrayList.size() != 0) {
            return this.f55551n;
        }
        return f55539u;
    }

    public final boolean e(int i3) {
        if ((i3 & this.f55549l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f55540a;
        if (view.getParent() != null && view.getParent() != this.f55557t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f55549l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f55549l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f55549l & 16) == 0) {
            WeakHashMap weakHashMap = r0.i0.f54015a;
            if (!this.f55540a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f55549l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f55553p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f55549l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f55549l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i3, boolean z10) {
        if (this.d == -1) {
            this.d = this.f55542c;
        }
        if (this.f55545g == -1) {
            this.f55545g = this.f55542c;
        }
        if (z10) {
            this.f55545g += i3;
        }
        this.f55542c += i3;
        View view = this.f55540a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f55647c = true;
        }
    }

    public final void o() {
        this.f55549l = 0;
        int i3 = this.f55542c;
        if (i3 != -1) {
            this.h = i3;
        }
        this.f55542c = -1;
        this.d = -1;
        this.f55543e = -1L;
        this.f55545g = -1;
        this.f55552o = 0;
        this.f55547j = null;
        this.f55548k = null;
        ArrayList arrayList = this.f55550m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f55549l &= -1025;
        this.f55555r = 0;
        this.f55556s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i3, int i10) {
        this.f55549l = (i3 & i10) | (this.f55549l & (~i10));
    }

    public final void q(boolean z10) {
        int i3;
        int i10 = this.f55552o;
        if (z10) {
            i3 = i10 - 1;
        } else {
            i3 = i10 + 1;
        }
        this.f55552o = i3;
        if (i3 >= 0) {
            if (!z10 && i3 == 1) {
                this.f55549l |= 16;
                return;
            } else if (z10 && i3 == 0) {
                this.f55549l &= -17;
                return;
            } else {
                return;
            }
        }
        this.f55552o = 0;
        boolean z11 = r2.f25040a;
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }

    public final boolean r() {
        if ((this.f55549l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f55549l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f55542c + " id=" + this.f55543e + ", oldPos=" + this.d + ", pLpos:" + this.f55545g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f55554q) {
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
        if ((this.f55549l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f55552o + ")");
        }
        if ((this.f55549l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f55540a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
