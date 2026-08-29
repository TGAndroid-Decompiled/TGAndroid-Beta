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
import com.google.android.gms.internal.play_billing.g4;
import j$.util.DesugarCollections;
import j7.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class u implements a4.z {
    public final int f45493a;
    public int f45494b;
    public Object f45495c;

    public u(char c3, int i10) {
        this.f45493a = i10;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f45495c) == null) {
            this.f45495c = new MediaCodecList(this.f45494b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f45495c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f45495c;
        int i10 = this.f45494b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f45494b--;
        return obj;
    }

    public void c(long j10) {
        int i10 = this.f45494b;
        long[] jArr = (long[]) this.f45495c;
        if (i10 == jArr.length) {
            this.f45495c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f45494b;
        this.f45494b = i11 + 1;
        ((long[]) this.f45495c)[i11] = j10;
    }

    public g.f d() {
        int i10;
        Message message;
        g.c cVar = (g.c) this.f45495c;
        g.f fVar = new g.f(cVar.f6856a, this.f45494b);
        View view = cVar.f6859e;
        g.e eVar = fVar.f6890f;
        if (view != null) {
            eVar.f6882r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f6880p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f6858c;
            if (drawable != null) {
                eVar.f6878n = drawable;
                ImageView imageView = eVar.f6879o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f6879o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f6860f;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = cVar.f6861g;
            eVar.getClass();
            if (yVar != null) {
                message = eVar.f6889z.obtainMessage(-2, yVar);
            } else {
                message = null;
            }
            eVar.f6874j = charSequence2;
            eVar.f6875k = message;
        }
        if (cVar.f6862i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f6857b.inflate(eVar.v, (ViewGroup) null);
            if (cVar.f6865l) {
                i10 = eVar.f6886w;
            } else {
                i10 = eVar.f6887x;
            }
            Object obj = cVar.f6862i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f6856a, i10, 16908308, (Object[]) null);
            }
            eVar.f6883s = arrayAdapter;
            eVar.f6884t = cVar.f6866m;
            if (cVar.f6863j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, eVar));
            }
            if (cVar.f6865l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f6870e = alertController$RecycleListView;
        }
        View view2 = cVar.f6864k;
        if (view2 != null) {
            eVar.f6871f = view2;
            eVar.f6872g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = cVar.h;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public long e(int i10) {
        if (i10 >= 0 && i10 < this.f45494b) {
            return ((long[]) this.f45495c)[i10];
        }
        StringBuilder o10 = l1.o(i10, "Invalid index ", ", size is ");
        o10.append(this.f45494b);
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public synchronized List f() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f45495c));
    }

    public long g(o3.h hVar) {
        f5.w wVar = (f5.w) this.f45495c;
        int i10 = 0;
        hVar.f(wVar.f6640a, 0, 1, false);
        int i11 = wVar.f6640a[0] & 255;
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
        hVar.f(wVar.f6640a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (wVar.f6640a[i10] & 255) + (i14 << 8);
        }
        this.f45494b = i13 + 1 + this.f45494b;
        return i14;
    }

    public void h(Object instance) {
        Object[] objArr = (Object[]) this.f45495c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i10 = this.f45494b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f45494b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f45494b = i12 + 1;
        }
    }

    @Override
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String j(g4 g4Var) {
        String str;
        w wVar = (w) this.f45495c;
        int i10 = this.f45494b;
        try {
            if (wVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = wVar.E;
                String packageName = wVar.C.getPackageName();
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
                v vVar = new v(g4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel S0 = eVar.S0();
                S0.writeString(packageName);
                S0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f4563a;
                S0.writeStrongBinder(vVar);
                eVar.f3996b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e10) {
            wVar.F(95, 28, z.f45512p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            g4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean q(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int r() {
        if (((MediaCodecInfo[]) this.f45495c) == null) {
            this.f45495c = new MediaCodecList(this.f45494b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f45495c).length;
    }

    public String toString() {
        switch (this.f45493a) {
            case 12:
                return new String((char[]) this.f45495c, 0, this.f45494b);
            default:
                return super.toString();
        }
    }

    @Override
    public boolean x() {
        return true;
    }

    public u(Object obj, int i10, int i11) {
        this.f45493a = i11;
        this.f45495c = obj;
        this.f45494b = i10;
    }

    public u(w5.a aVar, int i10) {
        this.f45493a = 3;
        z5.l.h(aVar);
        this.f45495c = aVar;
        this.f45494b = i10;
    }

    public u(int i10, byte b10) {
        this.f45493a = i10;
        switch (i10) {
            case 7:
                this.f45495c = new ArrayList();
                this.f45494b = 128;
                return;
            case 8:
                this.f45494b = 0;
                this.f45495c = new StringBuilder();
                return;
            case 9:
            case 10:
            default:
                this.f45495c = new long[32];
                return;
            case 11:
                this.f45495c = new f5.w(8);
                return;
        }
    }

    public u(int i10) {
        this.f45493a = 9;
        if (i10 > 0) {
            this.f45495c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public u(int i10, a5.e[] eVarArr) {
        this.f45493a = 10;
        this.f45494b = i10;
        this.f45495c = eVarArr;
    }

    public u(Context context) {
        this.f45493a = 5;
        int e10 = g.f.e(context, 0);
        this.f45495c = new g.c(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.f45494b = e10;
    }

    public u(boolean z10, boolean z11) {
        this.f45493a = 1;
        this.f45494b = (z10 || z11) ? 1 : 0;
    }
}
