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
import k2.g0;
import w7.n7;
public abstract class j {
    public static final k6.c[] f46084a = new k6.c[0];
    public static final k6.c f46085b;
    public static final k6.c f46086c;
    public static final t7.l d;

    static {
        k6.c cVar = new k6.c("vision.barcode", 1L);
        k6.c cVar2 = new k6.c("vision.custom.ica", 1L);
        k6.c cVar3 = new k6.c("vision.face", 1L);
        k6.c cVar4 = new k6.c("vision.ica", 1L);
        k6.c cVar5 = new k6.c("vision.ocr", 1L);
        k6.c cVar6 = new k6.c("mlkit.langid", 1L);
        f46085b = cVar6;
        k6.c cVar7 = new k6.c("mlkit.nlclassifier", 1L);
        k6.c cVar8 = new k6.c("tflite_dynamite", 1L);
        k6.c cVar9 = new k6.c("mlkit.barcode.ui", 1L);
        k6.c cVar10 = new k6.c("mlkit.smartreply", 1L);
        f46086c = new k6.c("mlkit.segmentation.subject", 1L);
        a5.a aVar = new a5.a(20, (byte) 0);
        aVar.B("barcode", cVar);
        aVar.B("custom_ica", cVar2);
        aVar.B("face", cVar3);
        aVar.B("ica", cVar4);
        aVar.B("ocr", cVar5);
        aVar.B("langid", cVar6);
        aVar.B("nlclassifier", cVar7);
        aVar.B("tflite_dynamite", cVar8);
        aVar.B("barcode_ui", cVar9);
        aVar.B("smart_reply", cVar10);
        t7.e eVar = (t7.e) aVar.d;
        if (eVar == null) {
            t7.l b10 = t7.l.b(aVar.f299b, (Object[]) aVar.f300c, aVar);
            t7.e eVar2 = (t7.e) aVar.d;
            if (eVar2 == null) {
                d = b10;
                a5.a aVar2 = new a5.a(20, (byte) 0);
                aVar2.B("com.google.android.gms.vision.barcode", cVar);
                aVar2.B("com.google.android.gms.vision.custom.ica", cVar2);
                aVar2.B("com.google.android.gms.vision.face", cVar3);
                aVar2.B("com.google.android.gms.vision.ica", cVar4);
                aVar2.B("com.google.android.gms.vision.ocr", cVar5);
                aVar2.B("com.google.android.gms.mlkit.langid", cVar6);
                aVar2.B("com.google.android.gms.mlkit.nlclassifier", cVar7);
                aVar2.B("com.google.android.gms.tflite_dynamite", cVar8);
                aVar2.B("com.google.android.gms.mlkit_smartreply", cVar10);
                t7.e eVar3 = (t7.e) aVar2.d;
                if (eVar3 == null) {
                    t7.l.b(aVar2.f299b, (Object[]) aVar2.f300c, aVar2);
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
            return ((r6.a) Tasks.await(new com.google.android.gms.common.api.j(context, s6.g.f47859k, com.google.android.gms.common.api.b.f6528t, com.google.android.gms.common.api.i.f6537c).f(new r(cVarArr, 1)).addOnFailureListener(new Object()))).f46991a;
        } catch (InterruptedException | ExecutionException e7) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e7);
            return false;
        }
    }

    public static void b(Context context) {
        t7.b bVar = t7.d.f48207b;
        Object[] objArr = {"ica"};
        n7.a(1, objArr);
        t7.g gVar = new t7.g(1, objArr);
        k6.e.f14707b.getClass();
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
        ?? jVar = new com.google.android.gms.common.api.j(context, s6.g.f47859k, com.google.android.gms.common.api.b.f6528t, com.google.android.gms.common.api.i.f6537c);
        s6.a b10 = s6.a.b(arrayList, true);
        if (b10.f47853a.isEmpty()) {
            e7 = Tasks.forResult(new r6.c(0, false));
        } else {
            v e10 = w.e();
            e10.d = new k6.c[]{k7.b.f14727c};
            e10.f6695b = true;
            e10.f6694a = 27304;
            e10.f6696c = new g0((s6.g) jVar, b10);
            e7 = jVar.e(0, e10.a());
        }
        e7.addOnFailureListener(new rb.a(19));
    }
}
