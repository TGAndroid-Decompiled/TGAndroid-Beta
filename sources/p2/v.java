package p2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.play_billing.h4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class v implements d4.w {
    public final int f44212a;
    public int f44213b;
    public Object f44214c;

    public v(char c3, int i10) {
        this.f44212a = i10;
    }

    @Override
    public boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int F() {
        if (((MediaCodecInfo[]) this.f44214c) == null) {
            this.f44214c = new MediaCodecList(this.f44213b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f44214c).length;
    }

    @Override
    public boolean J() {
        return true;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f44214c) == null) {
            this.f44214c = new MediaCodecList(this.f44213b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f44214c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f44214c;
        int i10 = this.f44213b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f44213b--;
        return obj;
    }

    public void c(long j10) {
        int i10 = this.f44213b;
        long[] jArr = (long[]) this.f44214c;
        if (i10 == jArr.length) {
            this.f44214c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f44213b;
        this.f44213b = i11 + 1;
        ((long[]) this.f44214c)[i11] = j10;
    }

    public g.f d() {
        int i10;
        Message message;
        g.c cVar = (g.c) this.f44214c;
        g.f fVar = new g.f(cVar.f6699a, this.f44213b);
        View view = cVar.f6702e;
        g.e eVar = fVar.f6733f;
        if (view != null) {
            eVar.f6725r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f6723p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f6701c;
            if (drawable != null) {
                eVar.f6721n = drawable;
                ImageView imageView = eVar.f6722o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f6722o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f6703f;
        if (charSequence2 != null) {
            androidx.biometric.z zVar = cVar.f6704g;
            eVar.getClass();
            if (zVar != null) {
                message = eVar.f6732z.obtainMessage(-2, zVar);
            } else {
                message = null;
            }
            eVar.f6717j = charSequence2;
            eVar.f6718k = message;
        }
        if (cVar.f6705i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f6700b.inflate(eVar.v, (ViewGroup) null);
            if (cVar.f6708l) {
                i10 = eVar.f6729w;
            } else {
                i10 = eVar.f6730x;
            }
            Object obj = cVar.f6705i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f6699a, i10, 16908308, (Object[]) null);
            }
            eVar.f6726s = arrayAdapter;
            eVar.f6727t = cVar.f6709m;
            if (cVar.f6706j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, eVar));
            }
            if (cVar.f6708l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f6713e = alertController$RecycleListView;
        }
        View view2 = cVar.f6707k;
        if (view2 != null) {
            eVar.f6714f = view2;
            eVar.f6715g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.m mVar = cVar.h;
        if (mVar != null) {
            fVar.setOnKeyListener(mVar);
        }
        return fVar;
    }

    public long e(int i10) {
        if (i10 >= 0 && i10 < this.f44213b) {
            return ((long[]) this.f44214c)[i10];
        }
        StringBuilder m9 = l.d.m(i10, "Invalid index ", ", size is ");
        m9.append(this.f44213b);
        throw new IndexOutOfBoundsException(m9.toString());
    }

    public synchronized List f() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f44214c));
    }

    public long g(r3.h hVar) {
        h5.w wVar = (h5.w) this.f44214c;
        int i10 = 0;
        hVar.f(wVar.f7308a, 0, 1, false);
        int i11 = wVar.f7308a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        hVar.f(wVar.f7308a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (wVar.f7308a[i10] & 255) + (i14 << 8);
        }
        this.f44213b = i13 + 1 + this.f44213b;
        return i14;
    }

    public void h(Object instance) {
        Object[] objArr = (Object[]) this.f44214c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i10 = this.f44213b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f44213b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f44213b = i12 + 1;
        }
    }

    public String i(h4 h4Var) {
        String str;
        x xVar = (x) this.f44214c;
        int i10 = this.f44213b;
        try {
            if (xVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = xVar.E;
                String packageName = xVar.C.getPackageName();
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                } else {
                                    str = "START_CONNECTION";
                                }
                            } else {
                                str = "IS_FEATURE_SUPPORTED";
                            }
                        } else {
                            str = "CONSUME_ASYNC";
                        }
                    } else {
                        str = "ACKNOWLEDGE_PURCHASE";
                    }
                } else {
                    str = "LAUNCH_BILLING_FLOW";
                }
                w wVar = new w(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel S0 = eVar.S0();
                S0.writeString(packageName);
                S0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f3451a;
                S0.writeStrongBinder(wVar);
                eVar.f135b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e6) {
            xVar.F(95, 28, a0.f44133p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean l(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String toString() {
        switch (this.f44212a) {
            case 12:
                return new String((char[]) this.f44214c, 0, this.f44213b);
            default:
                return super.toString();
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f44212a = i11;
        this.f44214c = obj;
        this.f44213b = i10;
    }

    public v(y5.a aVar, int i10) {
        this.f44212a = 1;
        b6.m.h(aVar);
        this.f44214c = aVar;
        this.f44213b = i10;
    }

    public v(int i10, byte b10) {
        this.f44212a = i10;
        switch (i10) {
            case 6:
                this.f44214c = new ArrayList();
                this.f44213b = 128;
                return;
            case 8:
                this.f44213b = 0;
                this.f44214c = new StringBuilder();
                return;
            case 11:
                this.f44214c = new h5.w(8);
                return;
            default:
                this.f44214c = new long[32];
                return;
        }
    }

    public v(int i10) {
        this.f44212a = 9;
        if (i10 > 0) {
            this.f44214c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public v(int i10, c5.e[] eVarArr) {
        this.f44212a = 10;
        this.f44213b = i10;
        this.f44214c = eVarArr;
    }

    public v(Context context) {
        this.f44212a = 3;
        int e6 = g.f.e(context, 0);
        this.f44214c = new g.c(new ContextThemeWrapper(context, g.f.e(context, e6)));
        this.f44213b = e6;
    }

    public v(boolean z4, boolean z10) {
        this.f44212a = 2;
        this.f44213b = (z4 || z10) ? 1 : 0;
    }
}
