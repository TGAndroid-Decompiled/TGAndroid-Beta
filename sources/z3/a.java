package z3;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.oh1;
import zh.r3;
public final class a implements d9.k, Vector.TLDeserializer, z1 {
    public final int f49251a;

    public a(int i10) {
        this.f49251a = i10;
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: z3.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f49251a) {
            case 3:
                r3.e2(new oh1(6, null));
                return;
            default:
                int i11 = r3.f51067r1;
                return;
        }
    }

    public a(r3 r3Var) {
        this.f49251a = 3;
    }
}
