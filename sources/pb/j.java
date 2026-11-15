package pb;

import a8.xa;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import c8.ed;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import tg.x;
public abstract class j {
    public static final n6.c[] f54954a = new n6.c[0];
    public static final n6.c f54955b;
    public static final n6.c f54956c;
    public static final w7.l d;

    static {
        n6.c cVar = new n6.c("vision.barcode", 1L);
        n6.c cVar2 = new n6.c("vision.custom.ica", 1L);
        n6.c cVar3 = new n6.c("vision.face", 1L);
        n6.c cVar4 = new n6.c("vision.ica", 1L);
        n6.c cVar5 = new n6.c("vision.ocr", 1L);
        n6.c cVar6 = new n6.c("mlkit.langid", 1L);
        f54955b = cVar6;
        n6.c cVar7 = new n6.c("mlkit.nlclassifier", 1L);
        n6.c cVar8 = new n6.c("tflite_dynamite", 1L);
        n6.c cVar9 = new n6.c("mlkit.barcode.ui", 1L);
        n6.c cVar10 = new n6.c("mlkit.smartreply", 1L);
        f54956c = new n6.c("mlkit.segmentation.subject", 1L);
        xa xaVar = new xa(24, (byte) 0);
        xaVar.A("barcode", cVar);
        xaVar.A("custom_ica", cVar2);
        xaVar.A("face", cVar3);
        xaVar.A("ica", cVar4);
        xaVar.A("ocr", cVar5);
        xaVar.A("langid", cVar6);
        xaVar.A("nlclassifier", cVar7);
        xaVar.A("tflite_dynamite", cVar8);
        xaVar.A("barcode_ui", cVar9);
        xaVar.A("smart_reply", cVar10);
        w7.e eVar = (w7.e) xaVar.d;
        if (eVar == null) {
            w7.l c10 = w7.l.c(xaVar.f713b, (Object[]) xaVar.f714c, xaVar);
            w7.e eVar2 = (w7.e) xaVar.d;
            if (eVar2 == null) {
                d = c10;
                xa xaVar2 = new xa(24, (byte) 0);
                xaVar2.A("com.google.android.gms.vision.barcode", cVar);
                xaVar2.A("com.google.android.gms.vision.custom.ica", cVar2);
                xaVar2.A("com.google.android.gms.vision.face", cVar3);
                xaVar2.A("com.google.android.gms.vision.ica", cVar4);
                xaVar2.A("com.google.android.gms.vision.ocr", cVar5);
                xaVar2.A("com.google.android.gms.mlkit.langid", cVar6);
                xaVar2.A("com.google.android.gms.mlkit.nlclassifier", cVar7);
                xaVar2.A("com.google.android.gms.tflite_dynamite", cVar8);
                xaVar2.A("com.google.android.gms.mlkit_smartreply", cVar10);
                w7.e eVar3 = (w7.e) xaVar2.d;
                if (eVar3 == null) {
                    w7.l.c(xaVar2.f713b, (Object[]) xaVar2.f714c, xaVar2);
                    w7.e eVar4 = (w7.e) xaVar2.d;
                    if (eVar4 == null) {
                        return;
                    }
                    throw eVar4.a();
                }
                throw eVar3.a();
            }
            throw eVar2.a();
        }
        throw eVar.a();
    }

    public static boolean a(Context context, n6.c[] cVarArr) {
        try {
            return ((u6.a) Tasks.await(new com.google.android.gms.common.api.j(context, v6.e.f58727l, com.google.android.gms.common.api.b.f5917j, com.google.android.gms.common.api.i.f5927c).f(new s(cVarArr, 1)).addOnFailureListener(new b(21)))).f57861a;
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void b(Context context) {
        w7.b bVar = w7.d.f59040b;
        Object[] objArr = {"ica"};
        ed.a(1, objArr);
        w7.g gVar = new w7.g(1, objArr);
        n6.e.f21070b.getClass();
        if (n6.e.a(context) >= 221500000) {
            int i7 = gVar.d;
            n6.c[] cVarArr = new n6.c[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                n6.c cVar = (n6.c) d.get(gVar.get(i10));
                q6.m.g(cVar);
                cVarArr[i10] = cVar;
            }
            c(context, cVarArr);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, n6.c[] cVarArr) {
        Task e10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s(cVarArr, 0));
        q6.m.a("APIs must not be empty.", !arrayList.isEmpty());
        com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(context, v6.e.f58727l, com.google.android.gms.common.api.b.f5917j, com.google.android.gms.common.api.i.f5927c);
        v6.a b10 = v6.a.b(arrayList, true);
        if (b10.f58722a.isEmpty()) {
            e10 = Tasks.forResult(new u6.c(0, false));
        } else {
            com.google.android.gms.common.api.internal.t b11 = u.b();
            b11.d = new n6.c[]{n7.b.d};
            b11.f6073b = true;
            b11.f6072a = 27304;
            b11.f6074c = new x(4, jVar, b10);
            e10 = jVar.e(0, b11.a());
        }
        e10.addOnFailureListener(new nb.a(21));
    }
}
