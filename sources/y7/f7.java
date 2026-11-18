package y7;

import a8.xa;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
public final class f7 implements oa.a, zi.x0 {
    public Object f60811a;
    public Object f60812b;
    public Object f60813c;

    public f7(int i7) {
        switch (i7) {
            case 4:
                this.f60811a = new ArrayList();
                this.f60812b = new ArrayList();
                return;
            default:
                this.f60811a = new HashMap();
                this.f60812b = new HashMap();
                this.f60813c = z7.e.f61517c;
                return;
        }
    }

    @Override
    public void A(MediaFormat mediaFormat) {
        this.f60813c = mediaFormat;
    }

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f60811a).put(cls, dVar);
        ((HashMap) this.f60812b).remove(cls);
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
        ((ArrayList) this.f60811a).add(allocateDirect);
        ((ArrayList) this.f60812b).add(bufferInfo2);
    }

    public f7(zi.p0 p0Var, Range range, xa xaVar) {
        this.f60811a = p0Var;
        this.f60812b = range;
        this.f60813c = xaVar;
    }
}
