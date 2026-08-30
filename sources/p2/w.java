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
import kh.a2;
public final class w implements d4.w {
    public final int f41028a;
    public int f41029b;
    public Object f41030c;

    public w(char c3, int i10) {
        this.f41028a = i10;
    }

    @Override
    public int B() {
        if (((MediaCodecInfo[]) this.f41030c) == null) {
            this.f41030c = new MediaCodecList(this.f41029b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f41030c).length;
    }

    @Override
    public boolean D() {
        return true;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f41030c) == null) {
            this.f41030c = new MediaCodecList(this.f41029b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f41030c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f41030c;
        int i10 = this.f41029b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f41029b--;
        return obj;
    }

    public void c(long j10) {
        int i10 = this.f41029b;
        long[] jArr = (long[]) this.f41030c;
        if (i10 == jArr.length) {
            this.f41030c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f41029b;
        this.f41029b = i11 + 1;
        ((long[]) this.f41030c)[i11] = j10;
    }

    public g.f d() {
        int i10;
        Message message;
        g.c cVar = (g.c) this.f41030c;
        g.f fVar = new g.f(cVar.f6234a, this.f41029b);
        View view = cVar.e;
        g.e eVar = fVar.f6266f;
        if (view != null) {
            eVar.f6258r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f6256p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f6236c;
            if (drawable != null) {
                eVar.f6254n = drawable;
                ImageView imageView = eVar.f6255o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f6255o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f6237f;
        if (charSequence2 != null) {
            androidx.biometric.z zVar = cVar.f6238g;
            eVar.getClass();
            if (zVar != null) {
                message = eVar.f6265z.obtainMessage(-2, zVar);
            } else {
                message = null;
            }
            eVar.f6250j = charSequence2;
            eVar.f6251k = message;
        }
        if (cVar.f6239i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f6235b.inflate(eVar.v, (ViewGroup) null);
            if (cVar.f6242l) {
                i10 = eVar.f6262w;
            } else {
                i10 = eVar.f6263x;
            }
            Object obj = cVar.f6239i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f6234a, i10, 16908308, (Object[]) null);
            }
            eVar.f6259s = arrayAdapter;
            eVar.f6260t = cVar.f6243m;
            if (cVar.f6240j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, eVar));
            }
            if (cVar.f6242l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = cVar.f6241k;
        if (view2 != null) {
            eVar.f6247f = view2;
            eVar.f6248g = false;
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
        if (i10 >= 0 && i10 < this.f41029b) {
            return ((long[]) this.f41030c)[i10];
        }
        StringBuilder m9 = a2.m(i10, "Invalid index ", ", size is ");
        m9.append(this.f41029b);
        throw new IndexOutOfBoundsException(m9.toString());
    }

    public synchronized List f() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f41030c));
    }

    public long g(r3.h hVar) {
        h5.w wVar = (h5.w) this.f41030c;
        int i10 = 0;
        hVar.h(wVar.f7000a, 0, 1, false);
        int i11 = wVar.f7000a[0] & 255;
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
        hVar.h(wVar.f7000a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (wVar.f7000a[i10] & 255) + (i14 << 8);
        }
        this.f41029b = i13 + 1 + this.f41029b;
        return i14;
    }

    public void h(Object instance) {
        Object[] objArr = (Object[]) this.f41030c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i10 = this.f41029b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f41029b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f41029b = i12 + 1;
        }
    }

    public String i(h4 h4Var) {
        String str;
        y yVar = (y) this.f41030c;
        int i10 = this.f41029b;
        try {
            if (yVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = yVar.E;
                String packageName = yVar.C.getPackageName();
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
                x xVar = new x(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel S0 = eVar.S0();
                S0.writeString(packageName);
                S0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f3457a;
                S0.writeStrongBinder(xVar);
                eVar.f124b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            yVar.F(95, 28, b0.f40975p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String toString() {
        switch (this.f41028a) {
            case 12:
                return new String((char[]) this.f41030c, 0, this.f41029b);
            default:
                return super.toString();
        }
    }

    @Override
    public boolean z(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public w(Object obj, int i10, int i11) {
        this.f41028a = i11;
        this.f41030c = obj;
        this.f41029b = i10;
    }

    public w(y5.a aVar, int i10) {
        this.f41028a = 1;
        b6.m.h(aVar);
        this.f41030c = aVar;
        this.f41029b = i10;
    }

    public w(int i10, byte b10) {
        this.f41028a = i10;
        switch (i10) {
            case 7:
                this.f41030c = new ArrayList();
                this.f41029b = 128;
                return;
            case 8:
                this.f41029b = 0;
                this.f41030c = new StringBuilder();
                return;
            case 9:
            case 10:
            default:
                this.f41030c = new long[32];
                return;
            case 11:
                this.f41030c = new h5.w(8);
                return;
        }
    }

    public w(int i10) {
        this.f41028a = 9;
        if (i10 > 0) {
            this.f41030c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public w(int i10, c5.e[] eVarArr) {
        this.f41028a = 10;
        this.f41029b = i10;
        this.f41030c = eVarArr;
    }

    public w(Context context) {
        this.f41028a = 3;
        int e = g.f.e(context, 0);
        this.f41030c = new g.c(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.f41029b = e;
    }

    public w(boolean z4, boolean z10) {
        this.f41028a = 2;
        this.f41029b = (z4 || z10) ? 1 : 0;
    }
}
