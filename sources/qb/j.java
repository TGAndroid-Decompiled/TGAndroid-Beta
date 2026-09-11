package qb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import t7.u;
import w7.h7;
public abstract class j {
    public static final k6.c[] f44286a = new k6.c[0];
    public static final k6.c f44287b;
    public static final k6.c f44288c;
    public static final t7.l d;

    static {
        k6.c cVar = new k6.c("vision.barcode", 1L);
        k6.c cVar2 = new k6.c("vision.custom.ica", 1L);
        k6.c cVar3 = new k6.c("vision.face", 1L);
        k6.c cVar4 = new k6.c("vision.ica", 1L);
        k6.c cVar5 = new k6.c("vision.ocr", 1L);
        k6.c cVar6 = new k6.c("mlkit.langid", 1L);
        f44287b = cVar6;
        k6.c cVar7 = new k6.c("mlkit.nlclassifier", 1L);
        k6.c cVar8 = new k6.c("tflite_dynamite", 1L);
        k6.c cVar9 = new k6.c("mlkit.barcode.ui", 1L);
        k6.c cVar10 = new k6.c("mlkit.smartreply", 1L);
        f44288c = new k6.c("mlkit.segmentation.subject", 1L);
        a5.a aVar = new a5.a(19, (byte) 0);
        aVar.z("barcode", cVar);
        aVar.z("custom_ica", cVar2);
        aVar.z("face", cVar3);
        aVar.z("ica", cVar4);
        aVar.z("ocr", cVar5);
        aVar.z("langid", cVar6);
        aVar.z("nlclassifier", cVar7);
        aVar.z("tflite_dynamite", cVar8);
        aVar.z("barcode_ui", cVar9);
        aVar.z("smart_reply", cVar10);
        t7.e eVar = (t7.e) aVar.d;
        if (eVar == null) {
            t7.l b10 = t7.l.b(aVar.f285b, (Object[]) aVar.f286c, aVar);
            t7.e eVar2 = (t7.e) aVar.d;
            if (eVar2 == null) {
                d = b10;
                a5.a aVar2 = new a5.a(19, (byte) 0);
                aVar2.z("com.google.android.gms.vision.barcode", cVar);
                aVar2.z("com.google.android.gms.vision.custom.ica", cVar2);
                aVar2.z("com.google.android.gms.vision.face", cVar3);
                aVar2.z("com.google.android.gms.vision.ica", cVar4);
                aVar2.z("com.google.android.gms.vision.ocr", cVar5);
                aVar2.z("com.google.android.gms.mlkit.langid", cVar6);
                aVar2.z("com.google.android.gms.mlkit.nlclassifier", cVar7);
                aVar2.z("com.google.android.gms.tflite_dynamite", cVar8);
                aVar2.z("com.google.android.gms.mlkit_smartreply", cVar10);
                t7.e eVar3 = (t7.e) aVar2.d;
                if (eVar3 == null) {
                    t7.l.b(aVar2.f285b, (Object[]) aVar2.f286c, aVar2);
                    t7.e eVar4 = (t7.e) aVar2.d;
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

    public static boolean a(Context context, k6.c[] cVarArr) {
        try {
            return ((r6.a) Tasks.await(new com.google.android.gms.common.api.j(context, s6.g.f45953k, com.google.android.gms.common.api.b.f4949t, com.google.android.gms.common.api.i.f4958c).f(new r(cVarArr, 1)).addOnFailureListener(new Object()))).f44924a;
        } catch (InterruptedException | ExecutionException e7) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e7);
            return false;
        }
    }

    public static void b(Context context) {
        t7.b bVar = t7.d.f46438b;
        Object[] objArr = {"ica"};
        h7.a(1, objArr);
        t7.g gVar = new t7.g(1, objArr);
        k6.e.f14816b.getClass();
        if (k6.e.a(context) >= 221500000) {
            int i10 = gVar.d;
            k6.c[] cVarArr = new k6.c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                k6.c cVar = (k6.c) d.get(gVar.get(i11));
                n6.l.h(cVar);
                cVarArr[i11] = cVar;
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

    public static void c(Context context, k6.c[] cVarArr) {
        Task e7;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        n6.l.a("APIs must not be empty.", !arrayList.isEmpty());
        ?? jVar = new com.google.android.gms.common.api.j(context, s6.g.f45953k, com.google.android.gms.common.api.b.f4949t, com.google.android.gms.common.api.i.f4958c);
        s6.a b10 = s6.a.b(arrayList, true);
        if (b10.f45947a.isEmpty()) {
            e7 = Tasks.forResult(new r6.c(0, false));
        } else {
            v e10 = w.e();
            e10.d = new k6.c[]{k7.b.f14836c};
            e10.f5116b = true;
            e10.f5115a = 27304;
            e10.f5117c = new l.d((s6.g) jVar, b10);
            e7 = jVar.e(0, e10.a());
        }
        e7.addOnFailureListener(new u(19));
    }
}
