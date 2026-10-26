package sb;

import a8.ng;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
public abstract class j {
    public static final l6.c[] f48057a = new l6.c[0];
    public static final l6.c f48058b;
    public static final l6.c f48059c;
    public static final u7.l d;

    static {
        l6.c cVar = new l6.c("vision.barcode", 1L);
        l6.c cVar2 = new l6.c("vision.custom.ica", 1L);
        l6.c cVar3 = new l6.c("vision.face", 1L);
        l6.c cVar4 = new l6.c("vision.ica", 1L);
        l6.c cVar5 = new l6.c("vision.ocr", 1L);
        l6.c cVar6 = new l6.c("mlkit.langid", 1L);
        f48058b = cVar6;
        l6.c cVar7 = new l6.c("mlkit.nlclassifier", 1L);
        l6.c cVar8 = new l6.c("tflite_dynamite", 1L);
        l6.c cVar9 = new l6.c("mlkit.barcode.ui", 1L);
        l6.c cVar10 = new l6.c("mlkit.smartreply", 1L);
        f48059c = new l6.c("mlkit.segmentation.subject", 1L);
        ng ngVar = new ng(23, (byte) 0);
        ngVar.D("barcode", cVar);
        ngVar.D("custom_ica", cVar2);
        ngVar.D("face", cVar3);
        ngVar.D("ica", cVar4);
        ngVar.D("ocr", cVar5);
        ngVar.D("langid", cVar6);
        ngVar.D("nlclassifier", cVar7);
        ngVar.D("tflite_dynamite", cVar8);
        ngVar.D("barcode_ui", cVar9);
        ngVar.D("smart_reply", cVar10);
        u7.e eVar = (u7.e) ngVar.d;
        if (eVar == null) {
            u7.l b10 = u7.l.b(ngVar.f639b, (Object[]) ngVar.f640c, ngVar);
            u7.e eVar2 = (u7.e) ngVar.d;
            if (eVar2 == null) {
                d = b10;
                ng ngVar2 = new ng(23, (byte) 0);
                ngVar2.D("com.google.android.gms.vision.barcode", cVar);
                ngVar2.D("com.google.android.gms.vision.custom.ica", cVar2);
                ngVar2.D("com.google.android.gms.vision.face", cVar3);
                ngVar2.D("com.google.android.gms.vision.ica", cVar4);
                ngVar2.D("com.google.android.gms.vision.ocr", cVar5);
                ngVar2.D("com.google.android.gms.mlkit.langid", cVar6);
                ngVar2.D("com.google.android.gms.mlkit.nlclassifier", cVar7);
                ngVar2.D("com.google.android.gms.tflite_dynamite", cVar8);
                ngVar2.D("com.google.android.gms.mlkit_smartreply", cVar10);
                u7.e eVar3 = (u7.e) ngVar2.d;
                if (eVar3 == null) {
                    u7.l.b(ngVar2.f639b, (Object[]) ngVar2.f640c, ngVar2);
                    u7.e eVar4 = (u7.e) ngVar2.d;
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

    public static boolean a(Context context, l6.c[] cVarArr) {
        try {
            return ((s6.a) Tasks.await(new com.google.android.gms.common.api.j(context, t6.h.f48721k, com.google.android.gms.common.api.b.f6469j, com.google.android.gms.common.api.i.f6478c).f(new r(cVarArr, 1)).addOnFailureListener(new tb.a(22)))).f47887a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void b(Context context) {
        u7.b bVar = u7.d.f49597b;
        Object[] objArr = {"ica"};
        w7.l.a(1, objArr);
        u7.g gVar = new u7.g(1, objArr);
        l6.e.f16932b.getClass();
        if (l6.e.a(context) >= 221500000) {
            int i10 = gVar.d;
            l6.c[] cVarArr = new l6.c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                l6.c cVar = (l6.c) d.get(gVar.get(i11));
                o6.l.h(cVar);
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

    public static void c(Context context, l6.c[] cVarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        o6.l.a("APIs must not be empty.", !arrayList.isEmpty());
        com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(context, t6.h.f48721k, com.google.android.gms.common.api.b.f6469j, com.google.android.gms.common.api.i.f6478c);
        t6.a b10 = t6.a.b(arrayList, true);
        if (b10.f48714a.isEmpty()) {
            e = Tasks.forResult(new s6.c(0, false));
        } else {
            u b11 = v.b();
            b11.d = new l6.c[]{l7.b.f16950c};
            b11.f6621b = true;
            b11.f6620a = 27304;
            ?? obj = new Object();
            obj.f47816a = b10;
            b11.f6622c = obj;
            e = jVar.e(0, b11.a());
        }
        e.addOnFailureListener(new b(22));
    }
}
