package y7;

import a8.xa;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
public final class f7 implements oa.a, zi.y0 {
    public Object f60245a;
    public Object f60246b;
    public Object f60247c;

    public f7(int i7) {
        switch (i7) {
            case 4:
                this.f60245a = new ArrayList();
                this.f60246b = new ArrayList();
                return;
            default:
                this.f60245a = new HashMap();
                this.f60246b = new HashMap();
                this.f60247c = z7.e.f60952c;
                return;
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.f60245a).add(allocateDirect);
        ((ArrayList) this.f60246b).add(bufferInfo2);
    }

    @Override
    public oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.f60245a).put(cls, dVar);
        ((HashMap) this.f60246b).remove(cls);
        return this;
    }

    @Override
    public void o(MediaFormat mediaFormat) {
        this.f60247c = mediaFormat;
    }

    public f7(zi.q0 q0Var, Range range, xa xaVar) {
        this.f60245a = q0Var;
        this.f60246b = range;
        this.f60247c = xaVar;
    }
}
