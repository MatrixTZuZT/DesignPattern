package abstractfactory.myapp;

import abstractfactory.entity.Result;
import abstractfactory.entity.Scorer;
import abstractfactory.myapp.FemaleJumpingResult;
import abstractfactory.myapp.MaleJumpingResult;

/**
 * 跳远项目记分员类
 */
public class JumpingScorer extends Scorer {

    /**
     * 创建女子跳远成绩单
     * @param name
     * @return
     */
    public Result createFemaleResult(String name){
        Result result = new FemaleJumpingResult(name,5.5);
        System.out.println("JumpingScorer: FemaleJumpingResult of " + name + " is created.");
        return result;
    }

    /**
     * 创建男子跳远成绩单
     * @param name
     * @return
     */
    public Result createMaleResult(String name){
        Result result = new MaleJumpingResult(name,5.5);
        System.out.println("JumpingScorer: MaleJumpingResult of " + name + " is created.");
        return result;
    }
}
