package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.m9;
import org.telegram.messenger.q20;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.rc1;
import ph.q3;
import rh.d6;
import rh.e4;
public final class t implements u1, q20, m9, q3.g, androidx.car.app.utils.c, r9.e, qa.a, r9.d, Vector.TLDeserializer, x6, y6 {
    public final int f44458a;

    public t(int i10) {
        this.f44458a = i10;
    }

    public static AudioRecordingConfiguration g(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static MediaRoute2Info j(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object K(bh.d dVar) {
        ra.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
        return lambda$getComponents$0;
    }

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        switch (this.f44458a) {
            case 8:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void d(int i10, View view) {
        ((d6) view).setColor(i10);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public int f(View view) {
        return ((d6) view).f46776y;
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f44458a) {
            case 6:
                x1Var.dismiss();
                return;
            case 7:
                x1Var.dismiss();
                return;
            case 26:
                int i11 = e4.f46811s3;
                return;
            default:
                e4.c2(new rc1(6, null));
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Integer num = (Integer) obj;
        int i10 = q3.f45291c2;
        return 0;
    }

    @Override
    public void i(qa.b bVar) {
    }
}
