package y7;

import a8.xa;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
public final class f7 implements oa.a, zi.x0 {
    public Object f60856a;
    public Object f60857b;
    public Object f60858c;

    public f7(int i7) {
        switch (i7) {
            case 4:
                this.f60856a = new ArrayList();
                this.f60857b = new ArrayList();
                return;
            default:
                this.f60856a = new HashMap();
                this.f60857b = new HashMap();
                this.f60858c = z7.e.f61562c;
                return;
        }
    }

    @Override
    public void A(MediaFormat mediaFormat) {
        this.f60858c = mediaFormat;
    }

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f60856a).put(cls, dVar);
        ((HashMap) this.f60857b).remove(cls);
        return this;
    }

    @Override
    public void q(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.f60856a).add(allocateDirect);
        ((ArrayList) this.f60857b).add(bufferInfo2);
    }

    public f7(zi.p0 p0Var, Range range, xa xaVar) {
        this.f60856a = p0Var;
        this.f60857b = range;
        this.f60858c = xaVar;
    }
}
